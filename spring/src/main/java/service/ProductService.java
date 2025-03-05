package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Product;
import repository.ProductRepo;

@Service // Use @Service instead of @Component (more meaningful for business logic)
public class ProductService {

    private final ProductRepo productRepo; // Use final for immutability

    @Autowired // Constructor-based Dependency Injection (Best Practice)
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void addProduct(Product product) {
        productRepo.addProduct(product);
        System.out.println("Product added: " + product);
    }

    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

    public Product getProduct(Integer id) {
        return productRepo.getProduct(id);
    }

    public boolean updateProduct(Integer id, String newName) {
        return productRepo.updateProduct(id, newName);
    }

    public boolean deleteProduct(Integer id) {
        return productRepo.deleteProduct(id);
    }

    public List<Product> getProductsByName(String keyword) {
        return productRepo.getProductsByName(keyword);
    }
}
