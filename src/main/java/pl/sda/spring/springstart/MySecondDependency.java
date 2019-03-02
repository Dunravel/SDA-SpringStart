package pl.sda.spring.springstart;

import org.springframework.stereotype.Component;

@Component
public class MySecondDependency {

    public String getResponse(){
        return "\nthis is my second response\n";
    }
}
