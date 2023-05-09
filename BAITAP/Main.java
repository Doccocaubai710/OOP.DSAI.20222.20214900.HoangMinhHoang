import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		//TEST
		Customer customer1=new Customer("Hoàng");
		customer1.openAccount("HOANG710", 100000);
		customer1.openSavingAccount("HOANG0710", 100000, 3.5);
		
		Customer customer2=new Customer("Kiên");
		customer2.openAccount("Kaka",200000);
		customer2.openSavingAccount("K123", 30000, 4.2);
		
		Customer customer3=new Customer("Mai");
		customer3.openAccount("Maiii", 50000);
		customer3.openSavingAccount("Mai", 400000, 5.0);
		
		List<Customer> customers=new ArrayList<>();
		customers.add(customer3);
		customers.add(customer1);
		customers.add(customer2);
		
		for (Customer customer:customers) {//for customer in customers
			System.out.println("Customer "+ customer.getOwnerName());
			
			List<BankAccount> accounts = customer.getAccounts();
            for (BankAccount account : accounts) {
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Balance: " + account.getBalance());
                
                
                /*The instanceof keyword in Java is used to check if an object 
                 * belongs to a specific class or implements a specific interface*/
                if (account instanceof SavingAccount) {
                	SavingAccount savingAccount = (SavingAccount) account;//Cast to SavingAccount
                    savingAccount.withdraw();//cannot withdraw
                    System.out.println("Cannot withdraw from saving account");
                    System.out.println("Monthly Interest: "+  String.format("%.2f", savingAccount.monthlyInterest()));
                    savingAccount.deposit(20000);
                }
                
                account.deposit(50000);
                account.withdraw(20000);

                System.out.println("Updated Balance: " + account.getBalance());
                System.out.println("--------------------");
            }
            
            
         
             
           System.out.println("\n");
		}
		
		
		
	}
}
