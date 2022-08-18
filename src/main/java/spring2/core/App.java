package spring2.core;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp=context.getBean("emp2", Emp.class);         
        System.out.println(emp);
    }

