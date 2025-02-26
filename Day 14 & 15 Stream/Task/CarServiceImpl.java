package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface CarService{
	
}

public class CarServiceImpl implements CarService {
	public double sumOfPrices(List<Car> carList) {
		return carList.stream().mapToDouble(c->c.getPrice()).sum();
	
	}
	 public Set<String> getCarMakers(List<Car> carList) {
		 return carList.stream().map(Car::getCarMake).collect(Collectors.toSet());
	 }
	 
	 public Car getHighPricedCar(List<Car> carList) {
		 return carList.stream()
	                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
	                .limit(1)
	                .findFirst()
	                .orElse(null);
	    }
	 
	 public Car getCarWithLowPricedCar(List<Car> carList) {
		 return carList.stream().sorted((c1,c2)->Double.compare(c1.price,c2.price)).limit(1).findFirst().orElse(null);
	 }
	
	public static void main(String args[]) {
		 Car cars[] = {
		            new Car("Maruti", "Swift Dezire", 810000.00),
		            new Car("Hyundai", "Verna", 1100000.00),
		            new Car("Toyota", "Innova", 2450000.00),
		            new Car("Audi", "Q3", 4500000.00)
		        };

		        List<Car> carList = new ArrayList<>(Arrays.asList(cars));
		        CarServiceImpl carService = new CarServiceImpl();
		        
		        System.out.println("Sum of Prices: " + carService.sumOfPrices(carList));
		        System.out.println("Car Makers: " + carService.getCarMakers(carList));
		        System.out.println("Highest price car"+" "+carService.getHighPricedCar(carList));
		        System.out.println("Lowest priced car"+" "+ carService.getCarWithLowPricedCar(carList));
	}

}
