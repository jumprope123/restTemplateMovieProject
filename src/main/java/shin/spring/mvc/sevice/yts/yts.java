package shin.spring.mvc.sevice.yts;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import shin.spring.vo.YTSApi;

import java.nio.charset.Charset;

@Service
public class yts {

    //json객체를 반환하는 함수 생성
    public Object getDataFromApi(String sortBy, String orderBy){

        String url = "https://yts.mx/api/v2/list_movies.json";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)" +
                " AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

        headers.setContentType(new MediaType("application","json", Charset.forName("UTF-8")));

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("sortBy",sortBy)
                .queryParam("orderBy",orderBy)
                .build(false);

        Object response = restTemplate.exchange(builder.toString(), HttpMethod.GET, new HttpEntity<String>(headers), YTSApi.Response.class).getBody();
        return response;
    }

}
