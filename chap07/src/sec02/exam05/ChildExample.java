package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 부모 = 자식 (= 자동 참조 타입 변환)
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();		// 만약 Child.class 에 Override 되어있다면 Child.method1() 을 실행
		parent.method2();
		
		/*		compile error
		parent.field2 = "data2";
		parent.method3();
		*/
		/// 강제 타입 전환
		/// [Parent parent = new Child();] 가 없다면 불가능
		/// : 자동 타입 전환이 반드시 있어야함 
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}

}
