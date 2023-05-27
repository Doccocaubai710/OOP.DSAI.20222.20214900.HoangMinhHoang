
public class SavingAccount extends BankAccount {
	private double annualInterest;
	public SavingAccount(String ownerName, String accountNumber,double initialBalance,double annualInterest) {
		super(ownerName, accountNumber, initialBalance);
		this.annualInterest=annualInterest;
	}
	public double monthlyInterest(){
		return getBalance()*annualInterest/12;
		
	}
	
	public void withdraw() {
		//cannot withdraw from saving account
	}
	public void withdraw(double amount) {
		//do nothing
	}
}
