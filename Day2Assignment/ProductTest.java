package Day2Assignment;

public class ProductTest {

    public static void main(String[] args) {
       
        Product p = new Product();
        
       
        p.setProductno(1);
        p.setProdName("Washing Machine");
        p.setPrice(2000);
        p.setQty(3);
        
       
        System.out.println("Product Details:\n--------------------");
        System.out.println(p);
        
       System.out.print("Total price is : ");
        p.dispprice();
    }
}
