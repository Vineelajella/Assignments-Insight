package CoreAssignments;

public class Program3 {
	public boolean validatepan(String pan) {
		if(pan.length()!=8) {
			return false;
		}
		String regex="^[A-Z]{3}\\d{4}[A-Z]$";
		 return pan.matches(regex);
		
		
	}

}
