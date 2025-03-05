package repository;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import model.Product;
@Component
public class ProductRepo {
  static	List<Product> plist=new ArrayList<>();
	
	static {
	  plist.add(new Product(10,"pen"));
	 plist.add(new Product(20,"bag"));
	 plist.add(new Product(30,"tin"));
	}
	public void addProduct(Product product) {
		plist.add(product);
	//	System.out.println(plist);
	}
	//update, delete,list,list1 product
	
	public Product getProduct(Integer id) {  //to get single product
		Product p1=new Product();
		for(Product p:plist) {
			if(p.getId()==id) {
				p1.setId(p.getId());
			    p1.setName(p.getName());
			}
		}
		return p1;
		
	}
	
	
	public List<Product> getAllProducts(){
		
	 return plist;
	}
	public boolean updateProduct(Integer id,String name) {
		return plist.stream().filter(p -> p.getId().equals(id))
                .peek(p -> p.setName(name)) // Update the name
                .findFirst()
                .isPresent();
	}
	
	 public boolean deleteProduct(Integer id) {
	        return plist.removeIf(p -> p.getId().equals(id));
	    }

	    // Get products by name filter using Streams
	    public List<Product> getProductsByName(String keyword) {
	        return plist.stream()
	                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
	                .map(p -> new Product(p.getId(), p.getName())) // Return copies
	                .collect(Collectors.toList());
	    }
	
	

}
