package shin.spring.mvc.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class movieService {

    @Autowired
    private shin.spring.mvc.sevice.yts.yts yts;

    public Object response(String sortBy, String orderBy){
        return yts.getDataFromApi(sortBy,orderBy);
    }


}
