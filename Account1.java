package hasARelationship;

public class Account1 {
 private  String holdername;
 private long acno;
 private String ifsc;
 private String city;
 private double balance;
 private int paswd;
 private long cno;
 
 
public Account1(String holdername, long acno, String ifsc, String city, double balance, int paswd ,long cno) {
	super();
	this.holdername = holdername;
	this.acno = acno;
	this.ifsc = ifsc;
	this.city = city;
	this.balance = balance;
	this.paswd = paswd;
	this.cno=cno;
}


public String getHoldername() {
	return holdername;
}





public long getAcno() {
	return acno;
}





public String getIfsc() {
	return ifsc;
}




public String getCity() {
	return city;
}


public long getCno() {
	return cno;
}


public void setCno(long cno) {
	this.cno = cno;
}


public void setCity(String city) {
	this.city = city;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public int getPaswd() {
	return paswd;
}


public void setPaswd(int paswd) {
	this.paswd = paswd;
}


 
}
