package sec02.exam02;

public class Child extends Parent { 
	
	/// 필드없음
	
	/*
	Parent Class 를 상속 받았기 때문에
	Parent Class 의 모든 Field, Method 를 상속 받음
	아래 메소드가 생략된 상태 
	
	public void method1()
	public void method2()
	 */
	
	 @Override
	 public void method2() {
		 System.out.println("Child-method2()");
	 }
	 
	 public void method3() {
		 System.out.println("Child-method3()");
	 }
}
