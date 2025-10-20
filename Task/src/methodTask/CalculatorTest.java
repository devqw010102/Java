package methodTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalculatorTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Calculator calc = new Calculator();
		
		boolean flag = true;
		
		
		while(flag) {
			String input = br.readLine();
			st = new StringTokenizer(input);
			
			// 토큰 1개 break;
			if(st.countTokens() == 1) {
				System.out.println("입력 종료");
			}
			else {
				int x = Integer.parseInt(st.nextToken());
				String oper = st.nextToken();
				int y = Integer.parseInt(st.nextToken());
				
				switch(oper) {
				case "+" : 
					System.out.println("연산결과는 " + calc.getAdd(x, y) + "입니다.");
					break;
				case "-" :
					System.out.println("연산결과는 " + calc.getSub(x, y) + "입니다.");
					break;
				case "*" :
					System.out.println("연산결과는 " + calc.getMul(x, y) + "입니다.");
					break;
				case "/" :
					System.out.println("연산결과는 " + calc.getDiv(x, y) + "입니다.");
				}
			}
			// 1개 이상 연산작업
		}
	}

}
