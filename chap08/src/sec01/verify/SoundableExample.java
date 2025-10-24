package sec01.verify;

class Cat implements Soundable {
	/// 추상 메소드를 Override
	@Override
	public String sound() {
		return "야옹";
	}
}
class Dog implements Soundable {
	/// 추상 메소드를 Override
	@Override
	public String sound() {
		return "멍멍";
	}
}

public class SoundableExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}

}
