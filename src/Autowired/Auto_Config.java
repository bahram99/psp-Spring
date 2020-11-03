package Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Auto_Config {
    @Bean
    public MemberType memtype(){
        MemberType t1 = new MemberType();
        t1.setType("admin");
        return t1;
    }
    @Bean
    public MemberType memtype2(){
        MemberType t1 = new MemberType();
        t1.setType("reader");
        return t1;
    }
}
