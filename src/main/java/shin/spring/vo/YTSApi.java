package shin.spring.vo;

import lombok.Data;

import java.util.List;

public class YTSApi{

    @Data
    public static class Response{
        String status;
        MovieResponse data;
    }

    @Data
    public static class MovieResponse{
        int movie_count;
        int limit;
        int page_number;
        List<MovieItem> movies;
    }

    @Data
    public static class MovieItem {
        String title;
        String description_full;
        Long id;
        String small_cover_image;
        String large_cover_image;
        Long year;
        String genres[];
        Double rating;
    }

}
