package Q3;


import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
class product {
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class collector_class {
    public static void main(String[] args) {
        List<product> productsList = new ArrayList<product>();
        //Adding Products
        productsList.add(new product(1,"HP Laptop",25000f));
        productsList.add(new product(2,"Dell Laptop",30000f));

        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);
    }
}
