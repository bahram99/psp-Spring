package Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Auto_Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Auto_Config.class);
        Member m = (Member) ctx.getBean(Member.class);
        Address address = ctx.getBean(Address.class);

        address.setCity("tehran");
        m.setId(33);
        m.showall();
    }
}
