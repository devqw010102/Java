package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;	// 자동 참조 타입 변환
		
		parent.method1();	// 자동 타입 변환
		
		/// 타입 변환 + 오버라이딩 된 메소드 method2() 일 때는 자식클래스에 있는 오버라이딩 된 메소드를 호출 : 다형성
		/// parent 참조 변수는 Parent 클래스 타입(참조타입) 이므로,
		/// Parent 클래스에 있는 필드와 메소드에"만" 접근 가능
		/// method3() 메소드는 Parent 클래스가 아닌 Child 클래스에 있으므로 접근 불가
		parent.method2();	// Override Method
		
//		parent.method3();	// compile error
		
		
		/// 단 참조타입변환 + 메소드 오버라이딩 이루어지면(다형성)
		/// 오버라이딩 된 메소드를 호출(즉, 자식메소드를 호출)
	}

}
