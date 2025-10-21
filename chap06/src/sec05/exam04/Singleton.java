package sec05.exam04;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	// 외부 클래스로부터 생성자로 접근할 수 없도록 private
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
