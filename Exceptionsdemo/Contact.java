package Exceptionsdemo;

import java.time.LocalDate;
import java.util.Date;

public class Contact {
	String fname;
	String lname;
	LocalDate dob;
	String phnNum;
	String gender;
	String mname;
	
	public Contact(String fname, String lname, LocalDate dob, String phnNum, String gender, String mname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.phnNum = phnNum;
		this.gender = gender;
		this.mname = mname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhnNum() {
		return phnNum;
	}

	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", phnNum=" + phnNum + ", gender="
				+ gender + ", mname=" + mname + "]";
	}
}
