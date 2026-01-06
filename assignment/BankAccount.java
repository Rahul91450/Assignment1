package Assignment;

public class BankAccount {
private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount() {

	}

	public BankAccount(String a, String hn, double b) {
		setaccountNumber(a);
		setaccountHolderName(hn);
		setbalance(b);
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("deposit amount must be positive");
			return;
		}
		balance += amount;
		System.out.println("Deposited value-:" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdraw amount must be positive");
			return;
		}
		if (balance > amount) {
			System.out.println(" balance not sufficient");
		} else {
			balance -= amount;
			System.out.println("Amount Withdraw-:" + amount);
		}
	}

	public void setbalance(double b) {
		balance = b;
	}

	public double getbalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number-:" + getaccountNumber());
		System.out.println("Account Holder Name-:" + getaccountHolderName());
		System.out.println("balance-:" + getbalance());
	}

	public void setaccountNumber(String a) {
		accountNumber = a;
	}

	public void setaccountHolderName(String hn) {
		accountHolderName = hn;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public String getaccountHolderName() {
		return accountHolderName;
	}

}
