package tahlil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tahlil.hello;

@Configuration
public class Configtahlil {
    @Bean(name = "type")
    public hello salam(){
        return new hello();
    }
}
