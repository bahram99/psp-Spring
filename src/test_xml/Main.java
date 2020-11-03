package test_xml;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] arg){
/*
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Member m2 =(Member) factory.getBean("memid");
*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Member m1 =(Member) ctx.getBean(Member.class);
        Membertype mytype = (Membertype) ctx.getBean("typeid");
        mytype.setType("admin");

        m1.setId(1);
        m1.setName("bahram");
        m1.setMemtype(mytype);
        System.out.println(m1.getId());
    }
}
