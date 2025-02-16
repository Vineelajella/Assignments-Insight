package Exceptionsdemo;

public class Activity {
	String s1;
	String s2;
	String operator;
	
	public Activity(String s1, String s2, String operator) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.operator = operator;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	@Override
	public String toString() {
		return "Activity [s1=" + s1 + ", s2=" + s2 + ", operator=" + operator + "]";
	}
	
	

}
