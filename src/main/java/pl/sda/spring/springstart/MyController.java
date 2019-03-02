package pl.sda.spring.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    private MyDependency myDependency;

    @RequestMapping(value="test")
    @ResponseBody
    public String hello(){
        return "<b>this is response</b>";
    }

    @RequestMapping(value="getresponse")
    @ResponseBody
    public String getResponse(){
        return myDependency.getResponse();
    }

}
