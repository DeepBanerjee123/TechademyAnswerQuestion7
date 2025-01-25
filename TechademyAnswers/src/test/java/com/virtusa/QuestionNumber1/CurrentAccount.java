package com.virtusa.QuestionNumber1;


public class CurrentAccount extends Account {

	  CurrentAccount(double balance, double interestRate) throws Exception{
	    if(balance > 0){
	      setBalance(balance);
	    }
	    else{
	      throw new Exception("Balance cannot be negative");
	    }
	    
	    setInterestRate(interestRate);
	  }

	  @Override
	  public double calculateInterest(){

	    return getBalance() + (getBalance() * getInterestRate());
	  }
	}