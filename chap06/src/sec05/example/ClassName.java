package sec05.example;

public class ClassName {

	// 인스턴스 필드
	int field1;
	// 인스턴스 메소드
	void method1() {}
	// 정적 필드
	static int field2;
	// 정적 메소드
	static void method2() {}
	
	// 정적 메소드
	static void method3() {
		
		ClassName name = new ClassName();	// 정적 멤버 객체 호출
		
//		field1 = 10;	// X : 인스턴스 필드
		name.field1 = 10;	// O
//		method1();		// X : 인스턴스 메소드 호출
		name.method1();		// O
		field2 = 10;	// 정적 필드
		method2();		// 정적 메소드 호출
	}
	
	// 인스턴스 메소드
	void method4() {
		int field1;		// 인스턴스 필드
		method1();		// 인스턴스 메소드 호출
		int field2;		// 정적 필드
		method2();		// 정적 메소드 호출
	}
}
