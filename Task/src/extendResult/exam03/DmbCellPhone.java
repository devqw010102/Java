package extendResult.exam03;

public class DmbCellPhone extends CellPhone {
	/// 필드
	int channel;
	
	/// 생성자
	DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	/// 메소드
	void dmbOn() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void dmbOff() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	
}
