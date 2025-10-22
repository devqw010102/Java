package sec01.exam03;

public class Computer extends Calculator {
	/// 부모클래스(Calculator)의 areaCircle() 메소드의 계산 결과가 정밀하지 않음
	/// 그래서 자식클래스(Computer)에 정밀도를 높힌 areaCircle() 메소드를 재정의(Override)
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
