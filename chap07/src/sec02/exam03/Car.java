package sec02.exam03;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	/// 생성자
	/// 기본 생성자 자동으로 추가 되어있음
	/// Car() { }
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if(!frontLeftTire.roll()) {stop(); return 1; }
		if(!frontRightTire.roll()) { stop(); return 2;}
		if(!backLeftTire.roll()) {stop(); return 3;}
		if(!backRightTire.roll()) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
