
public class BankAccount {
	private String ownerName;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String ownerName, String accountNumber, double initialBalance) {
		this.ownerName=ownerName;
		this.accountNumber=accountNumber;
		this.balance=Math.max(initialBalance, 50000);//since the balance is at least 50000 in any case.
		
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getAccountNumber() {
		return accountNumber;
		
	}
	public double getBalance() {
		return balance;
		
	}
	public void decreaseBalance(double amount) {
		if (amount>0 && amount<=balance) {
			balance-=amount;
		}
	}
	public void increaseBalance(double amount) {
		if (amount>0) {
			balance+=amount;
		}
	}
	public void deposit(double amount) {
		if (amount>0) {
			balance+=amount;
		}
	}
	public void withdraw(double amount) {
		if (amount>0 && balance>=amount) {
			balance-=amount;
			balance-=5000;
			
		}
	}
}
