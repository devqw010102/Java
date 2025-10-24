package sec03.example;

class AbstractCat extends AbstractAnimal {
	@Override 
	void sound() {
		System.out.println("냐옹");
	}
}
class AbstractDog extends AbstractAnimal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}


public abstract class AbstractAnimal {
	abstract void sound();
}
