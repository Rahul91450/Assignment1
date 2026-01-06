package Assignment;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(String a, String hn, double b,double interestRate) {
		super(a, hn, b);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interset = getbalance() * interestRate;
		setbalance(getbalance() + interset);
		System.out.println("interset applied balance-:" + interset);
	}

	public void displayAccountInfo() {
		System.out.println("Saving account info");
		super.displayAccountInfo();
		System.out.println("interest-:" + (interestRate * 100) + "%");
	
	}
}
