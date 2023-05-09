import java.util.ArrayList;
import java.util.List;



public class Customer {
	private String name;
	private List<BankAccount> personalAccounts;
	
	public Customer(String name) {
		this.name=name;
		personalAccounts= new ArrayList<>(); //since a customer can have one or more accounts
	}
	public void openAccount(String accountNumber, double initialBalance) {
		BankAccount bankAccount=new BankAccount(name, accountNumber, initialBalance);
		personalAccounts.add(bankAccount);
	}
	public void openSavingAccount(String accountNumber,double initialBalance,double annualInterest) {
		SavingAccount savingAccount=new SavingAccount(name, accountNumber, initialBalance, annualInterest);
		personalAccounts.add(savingAccount);
		
	}
	public String getOwnerName() {
		return name;
	}
	public List<BankAccount> getAccounts(){
		return personalAccounts;
	}
	
	
}
