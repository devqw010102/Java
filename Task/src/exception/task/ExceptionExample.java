package exception.task;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = (int)((Math.random() * 100) + 1);
		int input = 0;
		int count = 0;
		
		do {
			
			try {
				System.out.print("1과 100 사이의 값을 입력하세요 : ");
				input = Integer.parseInt(scanner.nextLine());
			}
			catch(Exception e) {
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(number > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(number < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("정답");
			}
			count++;
			
		} while(number != input);
		
		System.out.println(count + "번 만에 맞추셨습니다.");
		
		
		scanner.close();

	}

}
