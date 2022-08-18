package Setter.dep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Student student=(Student)context.getBean("Student");
        System.out.println("studentid"+student.getStudentid());
        System.out.println("name"+student.getStudentName());
        System.out.println("address"+student.getAddress());
    }
}

