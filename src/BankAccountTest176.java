
public class BankAccountTest176 {
//*TO PRINT OUT OVERDRAWN STATUS AND BALANCE I USED THE toString METHOD BECAUSE THERE WERE NO OTHER METHODS TO CALL TO PRINT JUST THOSE THINGS
	public static void main(String[] args) {
		BankAccount176 harrysChecking = new BankAccount176("Harry", 12345, 0.00, false);
		System.out.println(harrysChecking.toString());
		harrysChecking.deposit(200.00);
		System.out.println(harrysChecking.toString());
		harrysChecking.withdraw(500.00);
		System.out.println(harrysChecking.toString());
		harrysChecking.deposit(400.00);
		System.out.println(harrysChecking.toString());
		BankAccount176 harrysSavings = new BankAccount176("Harry", 86754, 500.00, false);
		System.out.println(harrysSavings.toString());
		harrysChecking.transfer(50.00, harrysSavings);
		System.out.println(harrysChecking.toString());
		System.out.println(harrysSavings.toString());
		

	}

}
