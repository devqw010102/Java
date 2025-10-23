package extendTask.exam03;

import java.util.Scanner;

public class MainApp {

	public static final int TURNON = 1;
	public static final int TURNOFF = 2;
	public static final int RECEIVEVOICE= 3;
	public static final int DMBON= 4;
	public static final int CHANNELCHANGE= 5;
	public static final int DMBOFF= 6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("모델명을 입력하세요. > ");
		String model = scanner.nextLine();
		System.out.print("색상을 입력하세요. >");
		String color = scanner.nextLine();
		System.out.print("채널을 입력하세요. >");
		int channel = Integer.parseInt(scanner.nextLine());
	
		
		
		DmbCellPhone phone = new DmbCellPhone(model, color, channel);
		
		int flag = 0;
		int receive = 0;
		
		while(flag != TURNOFF) {
			System.out.println("==============================================================================");
			System.out.println("1. 전원 켬 2. 전원 끔 3. 전화 받기 4. DMB 켜기 5. DMB채널 바꾸기 6. DMB 끄기 ");
			System.out.println("==============================================================================");
			flag = Integer.parseInt(scanner.nextLine());
			switch(flag) {
			case TURNON :
				phone.turnOn();
				break;
			case TURNOFF :
				phone.turnOff();
				break;
			case RECEIVEVOICE :
				phone.bell();
				while(receive != 3) {
					System.out.println("========================================");
					System.out.println("1. 말한다. 2. 듣는다. 3. 전화를 끊는다.");
					System.out.println("========================================");
					System.out.print("1번, 2번, 3번 중 하나를 선택하세요. > ");
					receive = Integer.parseInt(scanner.nextLine());
					
					if(receive == 1) {
						System.out.print("상대방에게 하시고자 하는 메세지를 입력하세요. > ");
						phone.sendVoice(scanner.nextLine());
					}
					else if(receive == 2) {
						System.out.print("상대방이 하시고자 하는 메세지를 입력하세요.> .");
						phone.receiveVoice(scanner.nextLine());
					}
					else if(receive == 3) {
						phone.hangUp();
					}
				}
				break;
			case DMBON :
				phone.dmbOn();
				break;
			case CHANNELCHANGE :
				System.out.println("변경할 채널 입력");
				phone.changeDmb(Integer.parseInt(scanner.nextLine()));
				break;
			case DMBOFF :
				phone.dmbOff();
			}
		}
		
		scanner.close();
	}

}
