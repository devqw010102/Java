package test;

import java.util.Scanner;

public class Q7_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 예금 || 2. 출금 || 3. 잔고 || 4. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			String select = scanner.nextLine();
			
			if(select.equals("1")) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
			}
			else if(select.equals("2")) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
			}
			else if(select.equals("3")) {
				System.out.println("잔고> " + balance);
			}
			else if(select.equals("4")) {
				run = false;
			}
			else {
				System.out.println("1 ~ 4까지만 입력");
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
