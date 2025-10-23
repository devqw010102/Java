package extendResult.exam02;

import java.util.Scanner;

public class Health {
	
	/// 필드 
	char gender;		// 성별
	double tall;		// 신장
	double weight;		// 체중
	
	/// 생성자
	Health() { }
	
	/// 메소드
	/// 성별, 신장, 체중 입력받기
	void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***** 비만도 Check *****");
		System.out.print("성별(M/F) : ");
		gender = scanner.nextLine().charAt(0);
		System.out.print("신장(Cm) : ");
		tall = Double.parseDouble(scanner.nextLine());
		System.out.print("체중(Kg) : ");
		weight = Double.parseDouble(scanner.nextLine());
		
		scanner.close();
	}
	/// 출력
	void output1() {
		System.out.println();
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall + "Cm");
		System.out.println("체중 - " + weight + "Kg");
	}
}
