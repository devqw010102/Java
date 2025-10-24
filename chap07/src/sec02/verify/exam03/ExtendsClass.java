package sec02.verify.exam03;

class A { }
class B extends A {	}
class C extends A { }
class D extends B { }
class E extends B { }
class F extends C { }

public class ExtendsClass {
	
	static void method1(B b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		/// P377
		/// 1. new B();
		method1(new B());
		
		/// 2. (B) new A();
		/// ClassCastException
		/// 자동 변환이 되지 않았으므로 Exception
		try {
			method1((B) new A());	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		/// 3. new D();
		method1(new D());
		
		/// 4. new E();
		method1(new E());
		
		/// 2-2 (B) new A()
		/// 자동 변환 이후 강제 변환시 사용 가능
		A a = new B();
		method1((B) a);
	}
}
