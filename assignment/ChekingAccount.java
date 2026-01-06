package Assignment;

public class ChekingAccount extends BankAccount {
	private double overdraftLimit;

	public ChekingAccount(String a, String hn, double b, double overdraftLimit) {
		super(a, hn, b);
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("withdrawl amount must be positive");
			return;
		}
		if (getbalance() - amount < -overdraftLimit) {
			System.out.println("overdraft limit exceeded");
		} else {
			setbalance(getbalance() - amount);
			System.out.println("withdraw amount-:" + amount);
		}
	}

	public void displayAccountInfo() {
		System.out.println("cheking account info");
		super.displayAccountInfo();
		System.out.println("overdraftLimit-:" + overdraftLimit);
	}
}
