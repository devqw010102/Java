package ArrayTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2_v2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("값 입력> ");
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		br.close();
		
		int sum = 0;
		double avg = 0;
		int count = st.countTokens();
		
		do {
			sum += Integer.parseInt(st.nextToken());
		}while(st.hasMoreTokens());
		
		avg = (double) sum / count;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}

}
