package Day2Assignment;

public class Product {
	int productno;
	String prodName;
	float price;
	int qty;
	public int getProductno() {
		return productno;
	}
	public void setProductno(int productno) {
		this.productno = productno;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	void dispprice() {
		float totalamt=price*qty;
		System.out.println(totalamt);
	}
	@Override
    public String toString() {
        return "Product No: " + productno + "\n" +
               "Product Name: " + prodName + "\n" +
               "Quantity: " + qty + "\n" +
               "Price: " + price;
    }
	
	
	
	

}
