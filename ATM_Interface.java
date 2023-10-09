package codsoft__project;

 
	import java.util.Scanner;



	class BankAccount{
		private double balance;
		public BankAccount(double initalBalance) {
			this.balance= initalBalance;
		}
		public double getBalance() {
			return balance;
		}
		public void deposit(double amount)
		{
			if(amount>0) {
				balance+=amount;
				System.out.println("Deposit successful.New balance:"+balance);
			}
			else
			{
				System.out.println("invalid amount for deposit.");
			}
		}
		public void withdraw(double amount) {
			if(amount>0 && amount <=balance)
	{
		balance-=amount;
		System.out.println("withdrawl successful.New balance:"+ balance);
	}
			else {
				System.out.println("Insufficient funds or invalid amount for withdrawl.");
		
	}
		}
	}
	class ATM{
		private BankAccount account;
		private Scanner Scanner;
		
			public ATM(BankAccount account) {
				this.account=account;
				this.Scanner=new Scanner(System.in);
				}
			public void ShowMenu() {
				System.out.println("1.check Balance");
				System.out.println("2.Deposit");
				System.out.println("3.withdraw");
				System.out.println("4.Exit");
			}
		public void run() {
			int option;
			do {
				ShowMenu();
				System.out.println("enter your option:");
				option = Scanner.nextInt();
				switch(option) {
			case 1:
					checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Thank you for using the ATM!");
				break;
			default:
					System.out.println("Invalid option.please select a valoid option.");
				}
			}while(option!=4);
		}
		private void checkBalance() {
			System.out.println("your current balance is:"+account.getBalance());
				}
		private void deposit() {
			System.out.println("Enter the amount to deposit:");
			double amount = Scanner.nextDouble();
			account.deposit(amount);
			}
		private void withdraw() {
			System.out.println("Enter the amount to withdraw:");
			double amount = Scanner.nextDouble();
			account.withdraw(amount);
		}
	} 
	    public  class ATM_Interface{
	    	public static void main(String[] args) {
				System.out.println("Welcome to the ATM ");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter th four digit PIN:");
				int enteredPin = sc.nextInt();
				BankAccount userAccount = new BankAccount(200000.0);
				ATM atm = new ATM(userAccount);
				atm.run();
			}
	    }


