package com.insight;

public class Loan {
	public int getEmi(int amt) {
		return amt/12;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int divide(int a,int b) {
		return a/b;
	}
	public void deposit() throws MyException{
		throw new MyException("sample exception");
		
	}
	

}
