package hasARelationship;
import java.util.Scanner;

public class ABDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		 Bank1 c1=new Bank1("SBI","Pune");
		 
		 boolean exit = true;
			while(exit)
			{
				   System.out.println("-----------------------------------------");
			   System.out.println("Enter the choice... ");
			   System.out.println("-----------------------------------------");
				System.out.println("\n1. Create Account: \n2. Remove Account:\n3. Update \n4. Display Details \n5 withdraw \n6 deposite \n7 checkbalance \n8.Exit");
				int choice = s1.nextInt();
				switch(choice) {
				
				case 1:
				{
					c1.CreateAccount() ;
				}
				break;
				
				case 2:
				{
					c1.removeAccount();
				}
				break;
				case 3:
				{
					c1.update();
				}
				break;
				case 4:
				{
					c1.display();
				}
				break;
				
				case 5:{
					c1.withdraw();
					
				}
				break;
				
                case 6:{
				
                	c1.deposit();
				}
				break;
                case 7:{
                	c1.checkbalance();
	
            }
                break;
				
				case 8:
				{
					exit = false;
					System.out.println("Application Closed...");
				}
				break;
				default:
				{
					System.out.println("Invalid Choice.");
				}
				break;
				}

}
	}
}