package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*		compile error
		parent.field2 = "data2";
		parent.method3();
		*/
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}

}
