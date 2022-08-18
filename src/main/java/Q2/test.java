package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        a a1=(a)context.getBean("b1");
        System.out.println(a1);

    }
}

