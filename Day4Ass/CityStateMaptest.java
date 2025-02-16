package Day4Ass;

public class CityStateMaptest {

	public static void main(String[] args) {

		CityStateMap c=new CityStateMap();
		c.addcityStatepair("Mumbai" ,"Maharashtra");
		c.addcityStatepair("Hyderabad", "Telangana");
		c.addcityStatepair("Kolkata ", " WestBengal");
		
		
		
		
		
		c.deleteCitiesForState("WestBengal");
		System.out.println(c.getCitiesForState("Telangana"));
		System.out.println(c.getAllstates());
		System.out.println(c.getAllcities());
		System.out.println(c.getAllstates());
		
		System.out.println(c.getCsm());
		

	}

}
