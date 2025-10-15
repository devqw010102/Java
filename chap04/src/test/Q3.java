package test;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int m = (int)(Math.random() * 6) + 1;
			int n = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + m + ", " + n + ")");
			
			if(m + n == 5)
				break;
		}
	}

}
