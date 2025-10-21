package example.bank;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		
//		ac.balance = 100;	// compile error
		ac.setBalance(10000);
		System.out.println(ac.getBalance());
		ac.setBalance(10000000);
		System.out.println(ac.getBalance());
		ac.setBalance(-100);
		System.out.println(ac.getBalance());
		ac.setBalance(35000);
		System.out.println(ac.getBalance());
	}

}
