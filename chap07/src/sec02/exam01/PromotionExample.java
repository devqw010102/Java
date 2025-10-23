package sec02.exam01;

class A { }

class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { } 

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		/// A class = B class
		/// 부모(big) = 자식(small) 
		/// Solution) 자동 타입 변환
		A a1 = b;
		
		/// A class = C class
		/// 부모(big) = 자식(small)
		/// Solution) 자동 타입 변환
		A a2 = c;
		
		/// A class = D class
		/// 부모(big) = 자식의 자식(smaller) 
		/// Solution) 자동 타입 변환
		A a3 = d;
		
		/// A class = E class
		/// 부모(big) = 자식의 자식(smaller) 
		/// Solution) 자동 타입 변환
		A a4 = e;
		
		/// B class = D class
		/// 부모(big) = 자식(small)
		/// Solution) 자동 타입 변환
		B b1 = d;
		
		/// C class = E class
		/// 부모(big) = 자식(small)
		/// Solution) 자동 타입 변환
		C c1 = e;
		
		
		/// B class = E class
		/// 상속 관계 X
		/// Solution) Compile Error : not extends
//		B b3 = e;
		
		/// C class = D class
		/// 상속 관계 X
		/// Solution) Compile Error : not extends
//		C c2 = d;
	}

}
