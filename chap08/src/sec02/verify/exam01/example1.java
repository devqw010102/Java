package sec02.verify.exam01;

public class example1 {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		A c = new A();
		a.test();
		b.test();
		c.test();
	}

}

class A implements Ai { 
	public void test() {
		System.out.println("asdf");
	}
}


class B extends A { }

interface Ai { 
	void test();
}