package loopConditionTaResult;

import java.util.ArrayList;
import java.util.Scanner;

public class result1_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				list.add(i);
				count++;
			}
		}
		
		System.out.println("약수의 개수는 " + count + "개 입니다.");
		
		scanner.close();
	}

}
