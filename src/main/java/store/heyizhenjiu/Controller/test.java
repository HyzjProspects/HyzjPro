package store.heyizhenjiu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {

//    @RequestMapping(value = "",method = RequestMethod.GET)
//    public String test(){
//        return "/index";
//    }

    //跳转到个人中心界面
    @RequestMapping(value = "/{pageName2}")
    public ModelAndView toPage( @PathVariable("pageName2") String pageName2) {
        ModelAndView mv = new ModelAndView(pageName2);
        return mv;
    }

}

