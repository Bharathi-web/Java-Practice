package Practice;


class Account{
	private String accHolder;
	private double balance;
	 public Account(String n,double b) {
		 accHolder=n;
		 balance=b;
	 }
	 public void setaccHolder(String name) {
		 this.accHolder=name;
	 }
	 public String getaccHolder() {
		 return accHolder;
	 }
	 public double getbalance() {
		 return balance;
	 }
	 
	 public void deposit(double amt) {
		 balance+=amt;
	 }
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("Bharathi",10000);
		System.out.println("Account Holder :"+a.getaccHolder());
		a.setaccHolder("Yogappriya");
		System.out.println("Account Holder :"+a.getaccHolder());

		System.out.println("Account Balance: "+a.getbalance());
		a.deposit(1000);
		System.out.println("Current Balance: "+a.getbalance());
	}

}
