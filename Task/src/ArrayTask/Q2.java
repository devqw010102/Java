package ArrayTask;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("값 입력> ");
		String str = scanner.nextLine();
		scanner.close();
		
		String strArray[] = str.split(" ");
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < strArray.length; i++) {
			sum += Integer.parseInt(strArray[i]);
		}
		avg = (double) sum / strArray.length;
		
		System.out.println("합계 " + sum);
		System.out.println("평균 " + avg);
		
	}

}
