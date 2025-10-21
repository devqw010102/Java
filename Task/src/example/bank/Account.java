package example.bank;

public class Account {
	private int balance;
	private final static int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;
	
	
	public void setBalance(int balance) {
		if((balance >= MIN_BALANCE) && (balance <= MAX_BALANCE)) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
