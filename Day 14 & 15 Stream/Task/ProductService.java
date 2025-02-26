package Task;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

	public static void main(String[] args) {
		List<Product> plist = Arrays.asList(
                new Product(1, "Sunflower Oil", "Oils", 5.0, 250.0, LocalDate.of(2025, 5, 20)),
                new Product(2, "Toor Dal", "Pulses", 3.0, 100.0, LocalDate.of(2024, 6, 15)),
                new Product(3, "Chili Powder", "Spices", 2.0, 75.0, LocalDate.of(2026, 7, 25)),
                new Product(4, "Lays Chips", "Snacks", 1.0, 50.0, LocalDate.of(2025, 12, 1)),
                new Product(5, "Milk", "Dairy", 10.0, 45.0, LocalDate.of(2024, 3, 10)),
                new Product(6, "Milk", "Dairy", 1.0, 90.0, LocalDate.of(2024, 2, 11))
        );
		 plist.stream().sorted((c1,c2)->Double.compare(c2.price, c1.price)).limit(1).forEach(c->System.out.print(c));
		 System.out.println("---");
		 plist.stream().sorted((c1,c2)->Double.compare(c1.price, c2.price)).limit(1).forEach(c->System.out.println(c+" "));
		  //list  product that already expired
		 LocalDate today = LocalDate.now();
		 System.out.println("products expired");
		 plist.stream().filter(p->p.expiry.isBefore(today)).forEach(System.out::println);
		 
		 //list product names list that will expire in next 10 days
		 System.out.println("10 days later expiry");
		 LocalDate tenDaysLater = today.plusDays(10);
		 plist.stream()
         .filter(p -> p.expiry.isAfter(tenDaysLater))
         .forEach(p -> System.out.println(p.name));
		 
		 // display count of  products of different types
		 System.out.println("count of products of diff types");
		 
		 
		 plist.stream().
         distinct().collect(Collectors.groupingBy(c -> c.type, Collectors.counting()))
         .forEach((type, count) -> System.out.println(type + ": " + count));
		 
 }
	
}
