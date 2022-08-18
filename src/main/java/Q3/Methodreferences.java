package Q3;

interface printable1{
    void print();
}
public class MethodReferences {
    public static void printsome(){
        System.out.println("Hello, this is printable  static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        printable1 print1 = MethodReferences::printsome;
        // Calling interface method
        print1.print();
    }
}
