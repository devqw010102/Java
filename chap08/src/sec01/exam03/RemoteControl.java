package sec01.exam03;

public interface RemoteControl {
	/// constant field
	/// public static final 이 생략되어있음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/// abstract method
	/// abstract 가 생략되어있음
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
