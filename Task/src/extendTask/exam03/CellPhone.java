package extendTask.exam03;

public class CellPhone {
	String model;
	String color;
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
		
	}
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대 : " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
