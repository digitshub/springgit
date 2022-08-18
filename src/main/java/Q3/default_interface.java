package Q3;
interface printable1{
    void print();
    default void msg(){System.out.println("default method");}
}
class Rectangle implements printable{
    public void print(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        printable d=new Rectangle();
        d.print();
        d.msg();
    }} 
