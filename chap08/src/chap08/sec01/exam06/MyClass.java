package chap08.sec01.exam06;

import chap08.sec01.exam03.RemoteControl;
import chap08.sec01.exam04.Audio;
import chap08.sec01.exam04.Television;

public class MyClass {

	/// field
	/// 참조타입 필드
	RemoteControl rc = new Television();
	
	/// construct
	/// 기본 생성자
	MyClass() {
		
	}
	/// 매개변수 1개(RemoteControl) 인 생성자
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	/// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
