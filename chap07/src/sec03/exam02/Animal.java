package sec03.exam02;

public abstract class Animal {
	/// 필드
	public String kind;
	
	/// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	/// 추상 메소드
	public abstract void sound();
}
