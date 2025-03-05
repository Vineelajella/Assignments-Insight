package Streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Productservice {
    public static void main(String[] args) {
        List<Product> plist = Arrays.asList(
                new Product(1, "Sunflower Oil", "Oils", 5.0, 250.0, LocalDate.of(2025, 5, 20), new Supplier(101, "Supplier A")),
                new Product(2, "Toor Dal", "Pulses", 3.0, 100.0, LocalDate.of(2024, 6, 15), new Supplier(102, "Supplier B")),
                new Product(3, "Chili Powder", "Spices", 2.0, 75.0, LocalDate.of(2026, 7, 25), new Supplier(101, "Supplier A")),
                new Product(4, "Lays Chips", "Snacks", 1.0, 50.0, LocalDate.of(2024, 12, 1), new Supplier(103, "Supplier C")),
                new Product(5, "Milk", "Dairy", 10.0, 45.0, LocalDate.of(2026, 3, 10), new Supplier(104, "Supplier D")),
                new Product(6, "Cheese", "Dairy", 1.0, 90.0, LocalDate.of(2025, 3, 13), new Supplier(104, "Supplier D"))
        );

        // Highest priced product
        System.out.println("Highest priced product");
        plist.stream()
        .sorted((c1, c2) -> Double.compare(c2.price, c1.price)) // Sorting in descending order
        .limit(1)
        .forEach(System.out::println);

    System.out.println("---");
    
    //lowest priced product
    System.out.println("Lowest priced product");
    plist.stream()
    .sorted((c1, c2) -> Double.compare(c1.price, c2.price)) // Sorting in descending order
    .limit(1)
    .forEach(System.out::println);

System.out.println("---");
LocalDate today = LocalDate.now();
System.out.println("List of product already expired");
	plist.stream().filter(p->p.expiryDate.isBefore(today)).forEach(System.out::println);
	 System.out.println("---");
	 
	 
	  //list product names list that will expire in next 10 days
	 System.out.println("Products expiring in the next 10 days:");
	 LocalDate tenDaysLater = today.plusDays(10);
	 plist.stream()
	     .filter(p -> p.expiryDate.isAfter(today) && p.expiryDate.isBefore(tenDaysLater)) 
	     .map(p -> p.name)
	     .forEach(System.out::println);
	 
	 System.out.println("Count of products by type:");
	 plist.stream()
	     .collect(Collectors.groupingBy(p -> p.type, Collectors.counting())) // Group by type and count
	     .forEach((type, count) -> System.out.println(type + ": " + count));
	 
	 System.out.println("Count of products by Supplier:");
	 plist.stream()
	     .collect(Collectors.groupingBy(p -> p.supplier.sname, Collectors.counting())) // Group by supplier name
	     .forEach((supplier, count) -> System.out.println(supplier + ": " + count));

	 
    }
    
}
