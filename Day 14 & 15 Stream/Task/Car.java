package Task;

public class Car {
	String carMake;
	String carName;
	double price;
	public Car(String carMake, String carName, double price) {
		super();
		this.carMake = carMake;
		this.carName = carName;
		this.price = price;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", carName=" + carName + ", price=" + price + "]";
	}
	
}
