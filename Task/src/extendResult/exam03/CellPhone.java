package extendResult.exam03;

public class CellPhone {
	/// 필드
	String model;
	String color;
	
	/// 생성자
	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	/// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	void send(String message) {
		System.out.println("나 : " + message);
	}
	void receive(String message) {
		System.out.println("상대방 : " + message);
	}
	
	
	
}
