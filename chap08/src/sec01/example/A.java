package sec01.example;

public class A {
	public static void main(String[] args) {
		/// 인스턴스 필드 접근
		B b = new B();
		System.out.println(b.b);
		
		/// 클래스 필드 접근
		System.out.println(B.a);
	}
}

class B {
	/// 클래스 필드
	static int a = 10;
	/// 인스턴스 필드
	int b = 10;
}
