package Q3;

interface printable{
    public void print();
}

public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        printable d2=()->{ System.out.println("print "+width); };
        d2.print();
    }
}
