package Q2;
 
public class a{
private int id;

@Override
public String toString() {
    return "a {" + "name='" + name + '\'' + ", b=" + b + ", id=" + id + '}';
}

public a(String name, int id, b b) {
    this.name = name;
    this.id = id;
    this.b=b;
}

}

