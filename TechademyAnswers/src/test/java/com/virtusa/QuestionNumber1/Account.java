package com.virtusa.QuestionNumber1;

public abstract class Account {
	  private double balance;
	  private double interestRate;

	  public double getBalance(){
	    return balance;
	  }

	  public void setBalance(double balance){
	      this.balance=balance;
	  }

	  public double getInterestRate(){
	    return interestRate;
	  }

	  public void setInterestRate(double interestRate){
	    this.interestRate=interestRate;
	  }

	  
	  public abstract double calculateInterest();
}