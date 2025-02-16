package CollectionsAss;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    
    static List<Product> plist = new ArrayList<>();

   
    public Double getPriceById(Integer id) {
        for (Product p : plist) {
            if (p.getId().equals(id)) {
                return p.getPrice();
            }
        }
        return null;
    }

   
    public String addProduct(Product p) {
        plist.add(p);
        return "success";
    }

    // List all products
    public void listProducts() {
        plist.forEach(x -> System.out.println(x));
    }

    // Remove product by ID
    public boolean removeById(Integer id) {
        boolean removed = plist.removeIf(p -> p.getId().equals(id));
        
        if (removed) {
            System.out.println("Product with id " + id + " deleted");
            return true;
        } else {
            System.out.println("Product with id " + id + " not found");
            return false;
        }
    }
}
