package Q3;

@FunctionalInterface
interface sayable{
    void say(String msg);
}
public class Functional_Interface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Functional_Interface fie = new Functional_Interface();
        fie.say("Hello there");
    }
}  
