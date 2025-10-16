package loopConditionTaResult;

import java.util.Scanner;

public class result3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int rand = (int)(Math.random() * 100) + 1;
		int count = 0;
		
		while(true) {
			System.out.print("1과 100 사이의 값을 입력하세요. ");
			int n = scanner.nextInt();
			count++;
			
			if(n == rand) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			}
			
			if(n > rand) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		}
		scanner.close();
	}

}
