package oop;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Bank savings = new Bank();
		Bank checking = new Bank();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your account number for both savings and checking:");
		savings.setAccountNum(input.nextInt());
		checking.setAccountNum(input.nextInt());
		System.out.println("Please enter your starting balance for both savings and checking:");
		savings.setBalance(input.nextInt());
		checking.setBalance(input.nextInt());
		// start of a lut of code
		savings.depositBalance(100.0);
		savings.setIntrest(0.18);
		checking.withdrawBalance(1000.0);
		savings.addIntrest();
		System.out.println(
				"Depositing $100 to Savings Account Please Wait\nSettings Intrest Rate to 18% for the Savings Account Please Wait\nWithdrawing $1,000 from the Checkng Account Please Wait\nAdding Intrest to the Savings Account Please Wait\nHow Much Would You like to Charge to the Checking Account?");
		checking.financeCharge(input.nextDouble());
		System.out.println("Money in checking account: " + checking.getBalance() + "\nMoney in savings account: "
				+ savings.getBalance());
		input.close();
	}
}
