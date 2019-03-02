package pl.sda.spring.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value="test")
    @ResponseBody
    public String hello(){
        return "<b>this is response</b>";
    }

}
