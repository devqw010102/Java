package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");	
		}
		else {
			System.out.println("method1 - Child 로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// classcastException 발생할 가능성 있음
		System.out.println("method2 - Child 로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Child();
		method1(parentB);
		method2(parentB);
	}

}
