package methodTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalcTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Calc calc = new Calc();
		
		int x = Integer.parseInt(st.nextToken());
		String oper = st.nextToken();
		int y = Integer.parseInt(st.nextToken());

		Object result = oper.equals("/") ? (Object) calc.cal(x, y) : calc.cal(x, oper, y);
		System.out.println("연산 결과는 " + result + "입니다.");
		
		// Parameter 중 Double 이 1개 이상있을 때 Method 
		// Parameter 2개 모두 Integer 일때 Method
		
		
	}

}
