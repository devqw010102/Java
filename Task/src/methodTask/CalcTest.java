package methodTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalcTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Calc calc = new Calc();
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		String oper = st.nextToken();
		int y = Integer.parseInt(st.nextToken());

		Object result = oper.equals("/") ? (Object) calc.cal(x, y) : calc.cal(x, oper, y);
		System.out.println("연산 결과는 " + result + "입니다.");
	}

}
