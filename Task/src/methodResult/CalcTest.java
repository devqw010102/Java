package methodResult;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		
		Scanner scanner = new Scanner(System.in);
		
		String s1 = scanner.next();
		String op = scanner.next();
		String s2 = scanner.next();
		
		scanner.close();
		
		double result = 0.0;
		
		boolean isDouble = s1.contains(".") || s2.contains(".");
		
		if(isDouble) {
			double x = Double.parseDouble(s1);
			double y = Double.parseDouble(s2);
			result = calc.cal(x, y, op);
		}
		else {
			int x = Integer.parseInt(s1);
			int y = Integer.parseInt(s2);
			result = calc.cal(x, y, op);
		}
		
		if(result % 1 == 0) {
			System.out.printf("연산결과는 %.0f입니다. %n", result);
		}
		else {
			System.out.printf("연산결과는 %.6f입니다. %n", result);
		}
	}

}
