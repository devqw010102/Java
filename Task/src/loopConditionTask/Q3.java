package loopConditionTask;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int rand = (int)(Math.random() * 100) + 1;
		boolean flag = true;
		int count = 1;
		
		while(flag) {
			
			System.out.print("1 과 100 사이의 값을 입력하세요.");
			int num = Integer.parseInt(scanner.nextLine());
			
			if(num == rand) {
				flag = false;
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
			}
			else if(num >= rand) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else if(num <= rand) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			count++;
		}
		
		
		scanner.close();
	}

}
