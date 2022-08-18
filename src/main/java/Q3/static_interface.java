package Q3;

interface printable{
    void print();
    static int cube(int x){return x*x;}
}
class Rectangle implements printable{
    public void print(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        printable p=new Rectangle();
        p.print();
        System.out.println(printable.cube(3));
    }}  
