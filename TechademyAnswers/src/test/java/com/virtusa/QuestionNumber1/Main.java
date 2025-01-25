package com.virtusa.QuestionNumber1;


class Main {
	  public static void main(String[] args) {
	    try{
	      CurrentAccount currentAccount = new CurrentAccount(1000, 0.1);
	      double currentAccAmount = currentAccount.calculateInterest();
	      System.out.println("Current Account= "+ currentAccAmount);

	      SavingsAccount savingsAccount = new SavingsAccount(20000, 0.2);
	      double savingAccAmount = savingsAccount.calculateInterest();
	      System.out.println("SavingsAccount= "+ savingAccAmount);
	    }
	    catch(Exception e){
	      System.out.println(e.getMessage());
	    }
	  }
	}
