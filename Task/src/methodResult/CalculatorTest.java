package methodResult;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		String op = scanner.next();
		int y = scanner.nextInt();
		
		scanner.close();
		
		double result = 0.0;
		
		if(op.equals("+")) {
			result = calc.getAdd(x, y);
		}
		else if(op.equals("-")) {
			result = calc.getSub(x, y);
		}
		else if(op.equals("*")) {
			result = calc.getMul(x, y);
		}
		else if(op.equals("/")){
			result = calc.getDiv(x, y);
		}
		
		if(op.equals("/")) {
			System.out.printf("연산 결과는 %.7f입니다. %n", result);
		}
		else {
			System.out.printf("연산 결과는 %.0f입니다. %n", result);
		}
	}

}
