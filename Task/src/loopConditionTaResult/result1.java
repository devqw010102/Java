package loopConditionTaResult;

import java.util.Scanner;

public class result1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// 입력받을 변수
		int num = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		int count = 0;
		
		System.out.print("{ ");
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				if(i == num)
					System.out.print(i);
				else
					System.out.print(i + ", ");
				count++;
			}
		}
		System.out.println("}");
		System.out.println("약수의 개수는 " + count + "개 입니다.");
	}

}
