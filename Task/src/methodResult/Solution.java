package methodResult;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		int sum = 0;
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		System.out.println("a부터 b까지의 합은 " + sum + "입니다.");
	}

}
