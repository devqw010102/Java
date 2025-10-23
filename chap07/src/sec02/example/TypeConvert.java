package sec02.example;

public class TypeConvert {

	class A {}
	class B extends A{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * P354 ~ P370
		 * 
		 * 기본 타입 변환
		 * 	1) 자동 타입 변환
		 * 		큰 타입 = (큰 타입[생략가능])작은 타입
		 * 	2) 강제 타입 변환
		 * 		작은 타입 = (작은 타입) 큰 타입
		 */
		/// 타입(기본) 변수명 = 리터럴
		int i = 10;
		
		/// 참조 타입 : 8 byte
		/// 참조 타입의 변환은 상속이 필수(부모 클래스가 더 큼)
		 
		/// 변환 X
//		A a = new A();
//		B b = new B();
		
		/// 변환 O
		/// 부모타입(big) = new 자식타입(small), 자동
//		A c = new B();
		/// 자식타입(small) = new 부모타입(big), 강제
		///	자동 변환 이후, 강제 변환
//		A c = new B();
//		B d = (B) c;
	}

}
