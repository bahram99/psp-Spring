package Dependent_Object;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main_DI {
    public static Integer id;
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("DI_config.xml");
        Employee employee = (Employee) ctx.getBean("emplo");
        employee.show();
        System.out.println(id);
    }
}


