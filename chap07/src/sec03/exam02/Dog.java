package sec03.exam02;

public class Dog extends Animal {
	/// 생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	/// 추상 메소드 Override
//	@Override : 생략 가능
	public void sound() {
		System.out.println("멍멍");
	}
}
