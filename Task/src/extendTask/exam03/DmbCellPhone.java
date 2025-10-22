package extendTask.exam03;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void dmbOn() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeDmb(int c) {
		this.channel = c;
		System.out.println("채널 " + c + "번으로 바꿉니다.");
	}
	void dmbOff() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
