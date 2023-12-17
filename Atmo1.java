package atm_m;
import java.util.Scanner;

public class Atmo1 {
	float balance;
	int PIN=5674;
	
	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc=new Scanner(System.in);
		
		int security=0;
		while(security<3) {
			int enterpin=sc.nextInt();
			if(enterpin==PIN) {
				menu();
				System.out.println("Thanx you !!");
				break;
			}
			else {
				System.out.println("Enter a Invalid pin");
			}
			security++;
			
		}
		if(security==3) {
			System.out.println("your ATM is block");
		}
		
	}
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. check A/C Balance");
		System.out.println("2. withdraw money");
		System.out.println("3. deposite money");
		System.out.println("4. Exit");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			checkbalance();
			break;
		case 2:
			withdrawmoney();
			break;
		case 3:
			depositmoney();
		case 4:
			break;
		default:
			System.out.println("Enter a valid choice");
			break;
		}
	}
	public void checkbalance() {
		System.out.printf("Balance: %.2f \n",balance);
		menu();
	}
	public void withdrawmoney() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc=new Scanner(System.in);
		float amount =sc.nextFloat();
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Money withdrawl Successful");
		}
		menu();
	}
	public void depositmoney() {
		System.out.println("Enter Amount to deposit: ");
		Scanner sc=new Scanner(System.in);
		float amount =sc.nextFloat();
		balance+=amount;
		System.out.println("money deposit successfully");
		menu();
		
	}

}
