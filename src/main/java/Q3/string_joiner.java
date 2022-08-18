package Q3;

import java.util.StringJoiner;
public class string_joiner {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        join.add("Rahul");
        join.add("Raju");
        join.add("Peter");
        join.add("Raheem");

        System.out.println(join);
    }
}
