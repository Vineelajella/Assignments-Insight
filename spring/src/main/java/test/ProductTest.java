package test;




import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Product;
import service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AutowiringConfig.class);
		ProductService productService=(ProductService)context.getBean(ProductService.class);
		
	//	ProductService ps=new ProductService();//
		
		
		Product product=new Product(40,"box");
	
		productService.addProduct(product);
		
		System.out.println(" Listing all products....");
		
	List<Product> plist=productService.getAllProducts();
		plist.stream().forEach(x->System.out.println(x));
	
		System.out.println(" get single product");
		System.out.println(productService.getProduct(10));
		System.out.println("Updating product 10...");
		System.out.println(productService.updateProduct(10, "pencil") ? "Update successful" : "Update failed");

		System.out.println("Deleting product 20...");
		System.out.println(productService.deleteProduct(20) ? "Deletion successful" : "Product not found");

		System.out.println("Searching for products with 'p'...");
		productService.getProductsByName("p").forEach(System.out::println);

	}

}

