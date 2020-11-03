package AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class run {
    public static void main(String[] arg){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Person person = ctx.getBean(Person.class);
        PersonType type = ctx.getBean(PersonType.class);
        Address address = (Address) ctx.getBean("addressid");

        address.setAddress("tehran");
        person.setAge(12);
        person.setPersonid(3);
        type.setPersontype("admin");
        person.setAddress(address);

        person.showall();
    }
}
