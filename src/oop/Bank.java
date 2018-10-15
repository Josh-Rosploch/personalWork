package oop;

public class Bank {
	public double balance;
	public int accountNum;
	public double intrest;

	public Bank() {
		balance = -999.0;
		accountNum = 999999;
		intrest = -999.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double set) {
		balance = set;
	}

	public void setAccountNum(int set) {
		accountNum = set;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double set) {
		intrest = set;
	}

	public void depositBalance(double add) {
		balance += add;
	}

	public void withdrawBalance(double remove) {
		balance -= remove;
	}

	public void addIntrest() {
		balance *= (1 + intrest);
	}

	public void financeCharge(double remove) {
		balance -= remove;
	}

}
