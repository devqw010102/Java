package exception.result;

import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/// 컴퓨터가 생각하는 숫자 변수
		int com = (int)(Math.random() * 100) + 1;
		/// 입력한 횟수 변수
		int count = 0;
		/// 사용자가 입력한 숫자 변수
		int user = 0;
		
		while(true) {
			
			/// 예외 처리
			try {
				System.out.print("1과 100 사이의 값을 입력하세요. > ");
				user = Integer.parseInt(scanner.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요.");
				continue;
			}
			
			count++;
			
			/// 컴퓨터가 생각한 숫자 > 사용자가 입력한 숫자
			if(com > user) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			/// 컴퓨터가 생각한 숫자 < 사용자가 입력한 숫자
			else if(com < user) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			/// 컴퓨터가 생각한 숫자 = 사용자가 입력한 숫자
			else if(com == user) {
				System.out.println("정답!");
				break;
			}
		}
		
		scanner.close();
		System.out.println(count + "번만에 맞추셨습니다.");
	}
}
