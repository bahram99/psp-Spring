package tahlil;

import AnnotationConfig.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_salam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        hello hel = (hello) context.getBean("saysalam");
        System.out.println(hel.getMessage());

        hello hel_2 = (hello) context.getBean("saysalam");
        hel_2.setMessage("salam test number two");
        System.out.println(hel_2.getMessage());

        hello hel_3 = (hello) context.getBean("saysalam_prototype");
        hel_3.setMessage("number 3");
        System.out.println(hel_3.getMessage());

        hello hel_4 = (hello) context.getBean("saysalam_prototype");
        System.out.println("return null..."+hel_4.getMessage());

        ApplicationContext contextfrom_annotation = new AnnotationConfigApplicationContext(Configtahlil.class);
        hello hel_anotate = (hello) contextfrom_annotation.getBean("type");
        hel_anotate.setMessage("annotation of config");
        System.out.println(hel_anotate.getMessage());
    }
}
