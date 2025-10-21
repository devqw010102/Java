package exampleResult.bank;

public class AccountExample {
	public static void main(String args[]) {
		Account ac = new Account();
		
		ac.setBalance(50000);
		System.out.println("현재 잔고 : " + ac.getBalance());
		
		ac.setBalance(100000);
		System.out.println("현재 잔고 : " + ac.getBalance());
		
		ac.setBalance(-100000);
		System.out.println("현재 잔고 : " + ac.getBalance());
		
		ac.setBalance(10000000);
		System.out.println("현재 잔고 : " + ac.getBalance());
	}
}
