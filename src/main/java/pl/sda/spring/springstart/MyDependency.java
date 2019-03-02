package pl.sda.spring.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "myDep")
public class MyDependency {
    @Autowired
    private MySecondDependency mySecondDependency;
    private String response = "this is data";

    public String getResponse() {

        return response + mySecondDependency.getResponse();
    }
}
