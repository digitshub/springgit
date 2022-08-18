package Q3;


	import java.util.*;
	import java.util.stream.Collectors;
	class Product{
	    int id;
	    String name;
	    float price;
	    public Product(int id, String name, float price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }
	}
	public class stream {
	    public static void main(String[] args) {
	        List<Product> productsList = new ArrayList<Product>();
	        //Adding Products
	        productsList.add(new Product(1,"HP Laptop",25000f));
	        productsList.add(new Product(2,"Dell Laptop",30000f));
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));

	        List<Float> productPrice2 =productsList.stream()
	                .filter(p -> p.price > 30000).map(p->p.price)        // fetching price  
	                .collect(Collectors.toList()); // collecting as list  ;
	        System.out.println(productPrice2);
	    }
	}



