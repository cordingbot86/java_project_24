package test07;
import java.util.*;
public class ATMproject {

	public static void main(String[] args) {
		int pin=1234;
		int balance=10000;
		int AddAmount=0;
		int TakeAmount=0;
		
		String name;
		Scanner scanner= new Scanner(System.in); 
		//we have to take an input by an user
		System.out.println("Enter your pin number");
		int password=scanner.nextInt();
		//code arrrangement shift+alt+f
		if(password==pin) 
		{
			System.out.println("Enter your name");
			name=scanner.next();
			System.out.println("Welecome"+name);
			while(true)
			{
				System.out.println("Press 1check your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("Press 3 to take  amount");
				System.out.println("Press 4 to take resipt");
				System.out.println("Press 5 to EXIT");
				int opt=scanner.nextInt();
				switch(opt)
				{
				case 1:
					System.out.println("Your current balance is "+balance);
					break;
				case 2:
					System.out.println("How much amount did you want to add to your account");
					AddAmount=scanner.nextInt();
					System.out.println("Successfully credited");
					balance=AddAmount+balance;
							//10000=100+10000
							//balance=10100
							break;
				case 3:
					System.out.println("How much amount did you want to take");
					TakeAmount=scanner.nextInt();
					if(TakeAmount>balance)
					{
						System.out.println("Your balance is insufficient");
						System.out.println("try less than your available balance");
						
					}
					else
					{
						System.out.println("successfully taken");
						balance=balance-TakeAmount;
						//balance=10100=10100-100
						//balance=10000
					}
					break;
				case 4:
				
					System.out.println("Welecome to All in one mini ATM");
					System.out.println("Available balance is"+balance);
					System.out.println("Available depsited"+AddAmount);
					System.out.println("Available Taken"+TakeAmount);
					System.out.println("Tanks for coming");
				
					break;
					
				}
				if(opt==5)
				{
					System.out.println("Thank you");
					break;
				}
			}
		}
		else
		{
			System.out.println("Wrong pin number");
		}
		scanner.close();
	}

}
