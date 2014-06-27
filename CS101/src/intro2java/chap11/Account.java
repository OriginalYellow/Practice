package intro2java.chap11;

import java.util.ArrayList;
import java.util.Date;

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date d = new Date();
	private String name = "no name";
	private ArrayList transactions = new ArrayList();

	public Account() {

	}

	public Account(int idParam, double balanceParam) {
		id = idParam;
		balance = balanceParam;
	}
	
	public Account(int idParam, double balanceParam, String name) {
		id = idParam;
		balance = balanceParam;
		this.name = name;
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
	
	public double withdraw(double amount, String description) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, description));
		return amount;
	}
	
	public void deposit(double amount, String description) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, description));
	}
	
	public void printTransactionInfo() {
		for (int x = 0; x < transactions.size(); x++) {
			System.out.println(transactions.get(x) + "\n");
		}
	}
	
	public static void main(String[] args) {
		Account a = new Account(1122, 1000, "George");
		a.setAnnualInterestRate(.015);
		a.deposit(30, "none");
		a.deposit(40, "none");
		a.deposit(50, "none");
		a.withdraw(5, "none");
		a.withdraw(4, "none");
		a.withdraw(2, "none");
		a.printTransactionInfo();
	}

}
