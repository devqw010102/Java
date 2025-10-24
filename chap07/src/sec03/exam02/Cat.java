package sec03.exam02;

public class Cat extends Animal {
	/// 생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	/// 추상 메소드 Override
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
