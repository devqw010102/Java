package loopConditionTask;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input : number 5ea
		Scanner scanner = new Scanner(System.in);
		
		int loop = 5;
		int odd = 0;
		int even = 0;
		
		while(loop != 0) {
			loop--;
			int n = Integer.parseInt(scanner.nextLine());
			
			if(n % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}	
		}
		scanner.close();
		
		System.out.println("홀수 " + odd + "개, 짝수 " + even + "개");
	}

}
