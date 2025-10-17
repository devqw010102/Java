package ArrayResult;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = new int[5];
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
			sum += nums[i];
		}
		
		scanner.close();
		avg = (double) sum / nums.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
