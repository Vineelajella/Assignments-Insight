package Streams;

import java.time.LocalDate;

public class Product {
    public Integer id;
    public String name;
    public String type;
    public Double qty;
    public Double price;
    public LocalDate expiryDate;
    public Supplier supplier;

    // Constructor
    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ ", expiryDate=" + expiryDate + ", supplier=" + supplier + "]";
	}

   
}
