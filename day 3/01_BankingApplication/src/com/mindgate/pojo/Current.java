package com.mindgate.pojo;

public class Current extends Account {

	private double overdraftBalance;
	private double fixoverdraft;

	public Current() {
		System.out.println("defalt construcor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		fixoverdraft=overdraftBalance;
		System.out.println("overloaded construcor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount>0) {
			if(amount<=getBalance()) {
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount>getBalance()) {
			//double remainAmount= amount- getBalance();
				amount= amount- getBalance();
				setBalance(0);
				setOverdraftBalance(getOverdraftBalance()- amount);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount>0) {
			if((amount+overdraftBalance)>=fixoverdraft) {
				//double remainBal=(amount+ overdraftBalance)-fixoverdraft;
				amount=(amount+ overdraftBalance)-fixoverdraft;
				setOverdraftBalance(fixoverdraft);
				setBalance(amount+ getBalance());
				return true;
			}
			else {
				setOverdraftBalance(amount+ getOverdraftBalance());
				return true;
			}
		}

		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
