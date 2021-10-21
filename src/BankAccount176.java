
public class BankAccount176 {
	long accountNum;
	String name;
	boolean overdrawn;
	private double balance;
	
	//constructor
	public BankAccount176(String name, long accountNum, double balance, boolean overdrawn) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
		this.overdrawn = overdrawn;
	}
	
	
	//gets the account number
	public long getAccountNum(long number) {
		accountNum = number;
		return number;
	}
	
	//sets the account number
	public void setAccountNum(long acctnum) {
		accountNum = acctnum;
	}
	
	//gets the account owner's name
	public String getAccountName(String name){
		this.name = name;
		return name;
	}
	
	//sets the account owner's name
	public void setAccountName(String acctname) {
		name = acctname;
	}
	
	//gets account overdrawn status
	public boolean isOverdrawn(boolean overdrawn) {
		return overdrawn;
	}
	
	//sets overdrawn status
	public void setOverdrawn(boolean status) {
		overdrawn = status;
	}
	
	//withdraw method takes money from the account
	public void withdraw(double amount) {
		if (overdrawn) {
           System.out.println("Insufficient funds");
        } else balance = balance - amount;
			System.out.println("You have withdrawn: " + amount);
		if(balance < 0) {
			overdrawn = true;
		}
	}
	
	//deposit method will add to balance
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("You have deposited: " + amount);
		if(balance > 0) {
			overdrawn = false;
		}
	}
	
	//transfer method moves amount from one account to another
	public void transfer(double amount, BankAccount176 otherAccount) {
		this.withdraw(amount);
		otherAccount.deposit(amount);
	}
	
	//addInterest method is used to add interest to balance
	public void addInterest() {
		balance = balance + (balance * .035);
	}
	
	//toString method will print out a nice clean summary of the account in a string
	public String toString() {
		String toString;
		if(overdrawn) {
			 toString = "The account number " + accountNum + " is owned by " + name + " with a Balance " + balance + ". It is overdrawn";
		}else { toString= "The account number " + accountNum + " is owned by " + name + " with a Balance " + balance + ". It is not overdrawn";
		 }return toString;
	}
	
}	
