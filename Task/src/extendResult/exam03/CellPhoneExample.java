package extendResult.exam03;

import java.util.Scanner;

public class CellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("모델명을 입력하세요. > ");
		String model = scanner.nextLine();
		System.out.print("색상을 입력하세요. > ");
		String color = scanner.nextLine();
		System.out.print("채널을 입력하세요. > ");
		int channel = Integer.parseInt(scanner.nextLine());
		
		DmbCellPhone cp = new DmbCellPhone(model, color, channel);
	
		int selectNo = 0;			// 기능
		int callNum = 0;			// 전화 받기
		String message = ""; 		// 문자
		
//		System.out.println("모델 : " + cp.model);
//		System.out.println("색상 : " + cp.color);
//		System.out.println("채널 : " + cp.channel);
		
		
		while(true) {
			System.out.println("============================================================================================");
			System.out.println("1. 전원 켬 2. 전원 끔 3. 전화 받기 4. DMB 켜기 5. DMB채널 바꾸기 6. DMB 끄기 ");
			System.out.println("============================================================================================");
		
			System.out.print("하고자 하는 기능을 선택하세요. > ");
			selectNo = Integer.parseInt(scanner.nextLine());

			
			if(selectNo == 1) {
				cp.powerOn();			
			}
			else if(selectNo == 2) {
				cp.powerOff();
				break;
			}
			else if(selectNo == 3) {
				cp.bell();			
				System.out.println("===========================================");
				System.out.println(" 1. 말한다. 2. 듣는다. 3. 전화를 끊는다.");
				System.out.println("===========================================");
				
				while(true) {
					System.out.print("1번, 2번, 3번 중 하나를 선택하세요. > ");
					callNum = Integer.parseInt(scanner.nextLine());
					
					if(callNum == 1) {
						System.out.print("상대방에게 하시고자 하는 메세지를 입력하세요. > ");
						message = scanner.nextLine();
						cp.send(message);
					}
					else if(callNum == 2) {
						System.out.print(" 상대방이 하시고자 하는 메세지를 입력하세요. > ");
						message = scanner.nextLine();
						cp.receive(message);
					}
					else if(callNum == 3) {
						cp.hangUp();
						break;
					}
					else {
						System.out.println("INPUT ERROR || 1, 2, 3 ||");
					}
				}
			}
			else if(selectNo == 4) {
				cp.dmbOn();
			}
			else if(selectNo == 5) {
				cp.changeChannel(Integer.parseInt(scanner.nextLine()));
			}
			else if(selectNo == 6) {
				cp.dmbOff();
			}
			else {
				System.out.println("INPUT ERROR || 1, 2, 3, 4, 5, 6 ||");
			}
		}
		

		
		scanner.close();
	}

}
