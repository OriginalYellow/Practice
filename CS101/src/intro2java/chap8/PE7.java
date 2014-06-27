package intro2java.chap8;

import java.util.*;

public class PE7 {
	
	public static void main(String[] args) {
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(.045);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("Balance: " + a.getBalance() + 
				"\nMonthly Interest: " + a.getMonthlyInterest() +
				"\nDate Created: " + a.getDateCreated());
	}

}

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date d = new Date();

	public Account() {

	}

	public Account(int idParam, double balanceParam) {
		id = idParam;
		balance = balanceParam;
	}

	public int getId() {
		return id;
	}

	public void setId(int idParam) {
		id = idParam;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balanceParam) {
		balance = balanceParam;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRateParam) {
		annualInterestRate = annualInterestRateParam;
	}
	
	public Date getDateCreated() {
		return d;
	}
	
	public double getMonthlyInterest() {
		return annualInterestRate * balance / 12;
	}
	
	public double withdraw(double amount) {
		balance -= amount;
		return amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}