package intro2java.chap11;

import java.util.Date;

public class Transaction {
	private Date date = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description = "no description given";
	
	public Transaction(char type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	public Date getDate() {
		return date;
	}
	
	protected void setDate(Date date) {
		this.date = date;
	}
	
	public char getType() {
		return type;
	}
	
	protected void setType(char type) {
		this.type = type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	protected void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getDescription() {
		return description;
	}
	
	protected void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return "Date: " + date + "\nType: " + type + "\nAmount: " + amount
				+ "\nRemaining Balance: " + balance + "\nDescription: "
				+ description;
	}
 }
