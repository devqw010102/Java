package sec01.exam04;

import sec01.exam03.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Interface type(참조)
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.turnOff();
		
		
		
	}

}
