package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone phone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);
		
		System.out.println("채널 : " + phone.channel);
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice("여보세요");
		phone.receiveVoice("안녕하세요");
		phone.sendVoice("반갑습니다.");
		phone.hangUp();
		
		phone.turnOnDmb();
		phone.changeChannelDmb(12);
		phone.turnOffDmb();
	}

}
