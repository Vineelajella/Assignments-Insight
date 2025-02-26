package Task;

import java.time.LocalDate;

public class Product {
	Integer id;
	String name;
	String type;
	Double qty;
	Double price;
	LocalDate expiry;
	public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiry) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.qty = qty;
		this.price = price;
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ ", expiry=" + expiry + "]";
	}
	

}
