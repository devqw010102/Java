package sec02.example.polymorphism;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 child1 = new Child1();
		
		/// 업 캐스팅 () 생략가능
		Parents parents = (Parents) child1;
		/// 다운 캐스팅 () 생략 불가능
		Child1 chil11 = (Child1) parents;
	}

}

class Parents {
	void print() {
		System.out.println("Parents");
	}
}

class Child1 extends Parents {
	void info() {
		System.out.println("Child1");
	}
}

class Child2 extends Parents {
	void info() {
		System.out.println("Child2");
	}
}