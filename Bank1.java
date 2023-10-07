package hasARelationship;

import java.util.Scanner;

public class Bank1 {

	String bname;
	String branch;
	Account1 a;
	
	public Bank1(String bname,String branch) {
		this.bname=bname;
		this.branch=branch;
	}
	
	
	Scanner s1=new Scanner(System.in);
	
public void CreateAccount() {
	System.out.println("Enter the name: ");
	String hn=s1.next();
	
	System.out.println("Enter the Account Number :");
	long an=s1.nextLong();
	
	System.out.println("Enter the IFSC code :");
	String ifsc=s1.next();
	
	System.out.println("Enter the city");
	String city=s1.next();
	
	System.out.println("Enter the Account balancce :");
	double bl=s1.nextLong();
	
	System.out.println("Enter the Passwword :");
	int pswd=s1.nextInt();
	
	
	System.out.println("Enter the contact Number :");
	long cno=s1.nextLong();
	
	Account1 a1=new Account1(hn,an,ifsc,city,bl,pswd,cno);
	
	
	if(this.a==null) {
		this.a=a1;
		System.out.println("Account Created Successfully..........: ");
	}
	else {
		System.out.println(" Already you hava a Account..........: ");
		
	}
	
	
}

public void removeAccount() {
	
	if(this.a==null) {
		System.out.println("First Create the Account..........: ");

	}
	else {
		System.out.println("Enter the password..........: ");
       
		int updps=s1.nextInt();
		
		
		if(updps==a.getPaswd()) {
			
			this.a=null;
			System.out.println("Account removed Successfully..........: ");

		}
		else {
			System.out.println("Incorrect Password..........: ");

		}
	}
}


public void update() {
	
	if(this.a==null) {
	System.out.println("first Create the account :");
	}
	
	else {
		System.out.println("Enter the password..........: ");
       
		int updps=s1.nextInt();
	     if(updps==a.getPaswd()) {
		
	      boolean exit=true;
	       while(exit) {
      	System.out.println("Enter the choise..........: ");
	System.out.println("\n1.Update city \n2 Update balance \n3 Update password \n4 Contact number \n5 exit:  ");
     int choise=s1.nextInt();
	

	switch (choise) {
	case 1: {
		System.out.println("update city: ");
		String city=s1.next();
		a.setCity(city);
		System.out.println("City updated successfully.....: ");
		
	}
	break;
	
	case 2:{
		System.out.println("update balance: ");
		double bal=s1.nextDouble();
		a.setBalance(bal);
		System.out.println("Balance updated successfully.....: ");
	}
	break;
	case 3:{
		System.out.println("update password: ");
		int psd=s1.nextInt();
		a.setPaswd(psd);
		System.out.println("password updated successfully.....: ");
	}
	break;
	case 4:{
		System.out.println("update contact number: ");
		long cno=s1.nextLong();
		a.setCno(cno);
		System.out.println("contact number updated successfully.....: ");
	}
	break;
	case 5:{
		exit=false;
	}
	break;
	
	
    	
	default:{
		System.out.println("Choise correct option: ");
	}
	}
	}
}
	     else {
	    	 System.out.println("Incorrect Password..........: ");
	     }
	}
}
	


	
public void display() {
	
	if(this.a==null) {
		System.out.println("first Create the account :");
		}
	else {
		System.out.println("Enter the password..........: ");
	       
		int updps=s1.nextInt();
	     if(updps==a.getPaswd()) {
	    		System.out.println("Bank name :"+bname);
	    		System.out.println("branch name :"+branch);
		System.out.println("Holder name is :"+a.getHoldername());
		System.out.println("Account number is : "+a.getAcno());
		System.out.println(" IFSC code is"+a.getIfsc());
		System.out.println(" City: "+a.getCity());
		System.out.println("contact number: "+a.getCno());
		System.out.println("Balance is: "+a.getBalance());
	     }
	     else {
	    	 System.out.println("Enter correct password..: ");
	         
	 		
	     }
	}
	
}	
	

public void withdraw() {
	if(this.a==null) {
		System.out.println("first Create the account :");
		}
	else {
		System.out.println("Enter the password..........: ");
	       
		int updps=s1.nextInt();
	     if(updps==a.getPaswd()) {
	    	 //update the balance
	    	 System.out.println("Enter the ammount you want to withdraw");
	    	 double amt=s1.nextDouble();
	    	 if(amt<=a.getBalance()) {
	    	 amt=a.getBalance()-amt;
	    	 a.setBalance(amt);
	    		System.out.println("amount withdraw completed successfully.....: ");
	    	 }
	    	 else {
	    		 System.out.println("insufficient balance: ");
	    	 }
	     }
	     else {
	    	 System.out.println("Enter correct password..: ");
	     }
		
	}
	
}

public void deposit() {
	if(this.a==null) {
		System.out.println("first Create the account :");
		}
	else {
		System.out.println("Enter the password..........: ");
	       
		int updps=s1.nextInt();
	     if(updps==a.getPaswd()) {
	    	 //update the balance
	    	 System.out.println("Enter the ammount you want to deposite");
	    	 double amt=s1.nextDouble();
	    	 amt=a.getBalance()+amt;
	    	 a.setBalance(amt);
	    		System.out.println("amount deposite completed successfully.....: ");
	     }
	     else {
	    	 System.out.println("Enter correct password..: ");
	     }
		
	}
	
}



public void checkbalance() {
	if(this.a==null) {
		System.out.println("first Create the account :");
		}
	else {
		System.out.println("Enter the password..........: ");
		int updps=s1.nextInt();
	     if(updps==a.getPaswd()) {
	       
	System.out.println("bank balance is : "+a.getBalance());
	     }
	     else {
	    	 System.out.println("Enter correct password");
	    	 }
	}
}	
	
	
	
	
}



