package sec01.exam03;

public class Calculator {
	/// 필드없음
	/// 생성자가 눈에 안 보임. (기본생성자 자동으로 추가)
	
	/// 메소드
	double areaCircle(double r) {		/// 인스턴스 메소드
		System.out.println("Claculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
