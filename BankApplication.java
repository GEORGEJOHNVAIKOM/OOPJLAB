import java.util.Scanner;

class  InvalidAmountException extends Exception{
	String message;
	public  InvalidAmountException(String s) {
		message = s;
	}
	public String getMessage() {
		return message;
	}
}

class Customer{
	int accountNumber;
	int bankBalance;
	static int minimumBalance = 2000;
	String name;
	Customer(){
		this.bankBalance = 2000;
	}
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Number: ");
		this.accountNumber = sc.nextInt();
		System.out.print("Enter the name: ");
		sc.nextLine();
		this.name = sc.nextLine();
	}
	void display() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Name: "+this.name);
		System.out.println("Bank Balance: "+this.bankBalance);
	}
	void deposit() {
		System.out.print("Enter the amount to be deposited: ");
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		try {
			if(change <= 0)
				throw new  InvalidAmountException("\nAmount is less than or equal to zero");
			else {
				this.bankBalance += change;
				System.out.println("The transaction has been finished successfully");
			}
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
			System.out.println("Transaction Failed!!");
			
		}
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to be withdrawn: ");
		int change = sc.nextInt();
		try {
			if(this.bankBalance - change < 2000)
				throw new InvalidAmountException("\nMinimum balance amount is exceeded");
			else {
				this.bankBalance -= change;
				System.out.println("The transaction has been finished successfully");
			}
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
			System.out.println("Transaction failed!!");
		}
	}
}

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer customers = new Customer();
		customers.getDetails();

		do {
			System.out.println("\n1.Display All Account Details");
			System.out.println("2.Search By Account Number");
			System.out.println("3.Deposit Amount");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			int choice;
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					customers.display();

			
				case 2:

					customers.deposit();
					break;
				case 3:

					customers.withdraw();
					break;
				case 4:
					sc.close();
					System.exit(0);
			}
		}while(true);
	}
}