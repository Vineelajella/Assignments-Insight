package CollectionsAss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductTest1 {

    public static void main(String[] args) throws IOException {
        List<Product> productList = new ArrayList<>();

        FileReader f1 = new FileReader("C:\\Users\\VineelaJella\\Documents\\product.txt");
        BufferedReader b = new BufferedReader(f1);
        
        String line;
        
        while ((line = b.readLine()) != null) {
            String[] productDetails = line.split(",");
            if (productDetails.length == 4) {
                Integer id = Integer.parseInt(productDetails[0].trim());
                String name = productDetails[1].trim();
                Integer qty = Integer.parseInt(productDetails[2].trim());
                Double price = Double.parseDouble(productDetails[3].trim());

                Product product = new Product(id, name, qty, price);
                productList.add(product);
            }
        }

        b.close();

        System.out.println("Products loaded from file:");
        for (Product product : productList) {
            System.out.println(product);
        }

        Integer searchId = 10;
        Product foundProduct = getProductById(productList, searchId);
        if (foundProduct != null) {
            System.out.println("\nProduct with ID " + searchId + ": " + foundProduct);
        } else {
            System.out.println("\nProduct with ID " + searchId + " not found.");
        }
    }

    public static Product getProductById(List<Product> productList, Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
