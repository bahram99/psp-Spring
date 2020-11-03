package AnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"/spring.xml"})
@ComponentScan(basePackages = "AnnotationConfig")

public class Config {
    @Bean
    public Person getperson(){
        return new Person();
    }

    @Bean
    public Degree num_one(){
        Degree d1 = new Degree();
        d1.setDegree(100);
        return d1;
    }
    @Bean
    public Degree num_two(){
        Degree d2 = new Degree();
        d2.setDegree(200);
        return d2;
    }
}
