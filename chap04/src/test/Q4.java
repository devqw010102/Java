package test;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (y * 5) == 60)
					System.out.println("(" + x + ", " + y + ")");
			}
		}
	}

}
