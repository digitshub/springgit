package Field.dep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
       ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        student student=(student)context.getBean("student");
        System.out.println("studentid"+student.getStudentid());
        System.out.println("name"+student.getStudentName());
    }
}
