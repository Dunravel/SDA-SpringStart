package pl.sda.spring.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStartApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringStartApplication.class, args);
        MyDependency myDependency = ctx.getBean(MyDependency.class);
        System.out.println(myDependency.getResponse());
        MyDependency myDependency1 = (MyDependency) ctx.getBean("myDep");
        System.out.println(myDependency1.getResponse());
    }
}
