package methodResult;

public class Calc {
	double cal(double x, double y, String op) {
		switch(op) {
		case "+" : return x + y;
		case "-" : return x - y;
		case "*" : return x * y;
		case "/" :
			if(y == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return 0.0;
			}
			return x / y;
			default :
				System.out.println("잘못된 연산자입니다.");
				return 0.0;
		}
	}
	
	int cal(int x, int y, String op) {
		switch(op) {
		case "+" : return x + y;
		case "-" : return x - y;
		case "*" : return x * y;
		case "/" :
			if(y == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return 0;
			}
			return x / y;
			default :
				System.out.println("잘못된 연산자입니다.");
				return 0;
		}
	}
}
