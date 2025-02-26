package Task;

import java.time.LocalDate;

public class Author {
	 Long adharCard;
	 String surname;
	 String firstname;
	 String lastname;
	 LocalDate birthdate;
	 String gender;
	 String city;
	 Long mobile;
	public Author(Long adharCard, String surname, String firstname, String lastname, LocalDate birthdate, String gender,
			String city, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.surname = surname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.city = city;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Author [adharCard=" + adharCard + ", surname=" + surname + ", firstname=" + firstname + ", lastname="
				+ lastname + ", birthdate=" + birthdate + ", gender=" + gender + ", city=" + city + ", mobile=" + mobile
				+ "]";
	}
	
	

}
