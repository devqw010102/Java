package sec03.example;

class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("냐옹");
	}
}
class Dog extends Animal {
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}


public class Animal {
	void sound() {
		System.out.println("소리를 낸다");
	}
}
