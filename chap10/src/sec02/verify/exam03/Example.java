package sec02.verify.exam03;

public class Example {
	public static void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	public static void main(String[] args) {
		/// 1
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		/// 2
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		/// 3
		try {
			method1();
		}
		catch(Exception e) {
			
		}
//		catch(ClassNotFoundException e) {
			
//		}
		
		/// 4
		try {
			method1();
		}
		catch(ClassNotFoundException e) {
			
		}
		catch(NumberFormatException e) {
			
		}
	}
	
	public static void method2() throws Exception {
		method1();
	}
}
