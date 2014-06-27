package intro2java.chap10;

import java.util.Date;

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

	/** Return the ID number */
	public int getId() {
		return id;
	}

	/** Set a new ID number */
	public void setId(int idParam) {
		id = idParam;
	}

	/** Return the balance */
	public double getBalance() {
		return balance;
	}

	/** Set a new balance */
	public void setBalance(int balanceParam) {
		balance = balanceParam;
	}

	/** Return the annual interest rate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annual interest rate */
	public void setAnnualInterestRate(double annualInterestRateParam) {
		annualInterestRate = annualInterestRateParam;
	}

	/** Return the date object for when the account object was created */
	public Date getDateCreated() {
		return d;
	}

	/** Get the monthly interest rate */
	public double getMonthlyInterest() {
		return annualInterestRate * balance / 12;
	}

	/** Withdraw money from the account */
	public double withdraw(double amount) {
		balance -= amount;
		return amount;
	}

	/** Deposit money into the account */
	public void deposit(double amount) {
		balance += amount;
	}

}