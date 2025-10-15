package test;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
