package Autowired;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("test")
public class Address {

    @PostConstruct
    public void first(){
        System.out.println("create");
     }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
