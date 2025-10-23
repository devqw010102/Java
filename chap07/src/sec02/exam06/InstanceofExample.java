package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		/// instanceof : 강제타입 전환 가능 여부(return : boolean)
		/// boolean boolean = [객체] instanceof [타입]
		if(parent instanceof Child) {		
			/// 자식 = (자식) 부모 : 강제 참조 타입 변환
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");	
		}
		else {
			System.out.println("method1 - Child 로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// ClassCastException 발생할 가능성 있음
		System.out.println("method2 - Child 로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 부모 = 자식
		Parent parentA = new Child();		// 자동 참조 타입 변환
		method1(parentA);					// method1(true)
		method2(parentA);
		
		Parent parentB = new Parent();		// Parent = Parent : Just Parent 객체 생성, 자동 참조 타입 변환 X
		method1(parentB);					// method1(false)
		method2(parentB);					// 예외 발생
	}

}
