package Assignment;

public class main {

	public static void main(String[] args) {
		BankAccount savings = new SavingAccount("SA001", "Alice", 1000.0, 0.045);
		savings.displayAccountInfo();
		savings.deposit(200);
		savings.withdraw(100);
		System.out.println();
		((SavingAccount) savings).applyInterest();
		System.out.println("-------------------");
		BankAccount cheking = new ChekingAccount("CA001", "Bob", 500.0, 1000);
		cheking.displayAccountInfo();
		cheking.withdraw(800);
		System.out.println("Balance after withdraw amount" + cheking.getbalance());
		cheking.withdraw(800);
	}

}
