package methodTask;

public class Calc {
	int cal(int x, String oper, int y) {
		switch(oper) {
		case "+" :
			return x + y;
		case "-" :
			return x - y;
		case "*" :
			return x * y;
//		case "/" :		//double
			
//			return cal((double)x / (double));
		default :
			return 0;
		}
	}
	
	double cal(int x, int y) {
		return (double) x / y;
	}
}
