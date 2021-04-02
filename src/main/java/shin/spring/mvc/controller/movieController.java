package shin.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import shin.spring.mvc.sevice.movieService;

@Controller
public class movieController {

    @Autowired
    private movieService movieService;

    @GetMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        String sort_by = "rating";
        String order_by = "desc";
        Object obj = movieService.response(sort_by, order_by);
        modelAndView.setViewName("/list");
        modelAndView.addObject("response",obj);
        return modelAndView;
    }

}
