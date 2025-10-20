package sec03.example;

public class Car {
	/*
	 * 생성자 매개변수는 타입, 개수가 다르면 여러개 생성가능
	 */
	Car() {}
	
	Car(String m, String c, int s) {			// String String Integer 
		
	}
	
	Car(String m, int s, String c) {			// String Integer String
		
	}
	
//	Car(String c, String m, int s) {			// String String Integer
//		
//	}
	
	Car(int s, String m, String c) {			// Integer String String
		
	}
	
	Car(String m, String c) {					// String String
		
	}
}
