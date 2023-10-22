package bankapplication;
import java.util.Scanner;
public class BankApplication {
	  private static Scanner scanner = new Scanner(System.in);
	    String fName;
	    String lName;
	    double balance;
	    int accNo;
	    String accType;
	    

	    //constructor 1 will be used to create an account instance
	    public BankApplication(String fName, String lName, double balance, String accType) {
	       this.fName = fName;
	       this.lName = lName;
	       this.balance = balance;
	       this.accType = accType;
	    }

	    //method 1 shows the initial balance
	    public void displayBalance() {
	    	System.out.println("****************************************************");
	    	System.out.println("ACCOUNT SUCCESSFULLY CREATED");
	    	accNo = 41122;
	    	System.out.println("Your Account number is:" +accNo);
	        System.out.println("Your current balance is:" + balance);
	        System.out.println("****************************************************");
	    }

	    //method 2 deposit money into the account
	    public double moneyDeposit(double depositAmount) {
	    	System.out.println("****************************************************");
	        System.out.println("Welcome! kindly input the amount of money you would like to deposit");
	        depositAmount = scanner.nextInt();
	        balance += depositAmount;
	        System.out.println("****************************************************");
	        return balance;
	    }

	    //method 3 calculate balance after withdrawal 
	    public double moneyWithdraw (double withdrawAmount) {
	    	System.out.println("****************************************************");
	    	System.out.println("Kindly input the amount you would like to withdraw");
	    	withdrawAmount = scanner.nextInt();
	    	balance -= withdrawAmount;
	    	System.out.println("****************************************************");
	    	return balance;
	    
	    }
	    
	    //method 4 shows the final balance after all transactions 
	    public void finalBalance() {
	    	System.out.println("****************************************************");
	    	System.out.println("Thankyou " +fName + " " +lName + " for using banking application \n");
	    	System.out.println("Account Number:" + accNo + "\n" + "Account Type:" + accType);
	    	System.out.println("Total Balance = Ksh" + balance);
	    	System.out.println("****************************************************");
	    }
	    
	    //main function
	    public static void main(String[] args) {
	    	
	    	System.out.println("Welcome User! Kindly assist us with your credentials to create an account with Banking Application\n");
	    	System.out.println("Input your first name: ");String firstName = scanner.nextLine();
	    	System.out.println("Input your last name: ");String lastName = scanner.nextLine();
	    	System.out.println("Input Account Type: ");String accountType = scanner.nextLine();
	    	System.out.println("Input your starting amount\n **MUST BE GREATER THAN 0**");double amount = scanner.nextDouble();
	    	
	    	//instance of a bank user
	    	BankApplication bankUser = new BankApplication(firstName, lastName, amount, accountType);
	    	//method to display initial balance called
	    	bankUser.displayBalance();
	    	
	    	System.out.println("TRANSACTION MENU");
	    	System.out.println("1. Deposit money");
	    	System.out.println("2. Withdraw money");
	    	System.out.println("3. Exit transaction menu");
	    	System.out.println("Kindly input the transaction you would like to carry out:");
	    	int choice = scanner.nextInt();
	    	switch(choice) {
	    	case 1: 
	    		//method to deposit money called
	    		double deposit = 0 ;
	    		bankUser.moneyDeposit(deposit);
	    		break;
	    	case 2:
	    		//method to withdraw money called
	    		double withdraw = 0;
	    		bankUser.moneyWithdraw(withdraw);
	    		break;
	    	default:
	    		System.out.println("EXIT");
	    	}
	    	bankUser.finalBalance();
	    		  	
	    }
}
