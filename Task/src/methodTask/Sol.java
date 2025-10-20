package methodTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Q3 q3 = new Q3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int r = q3.solution(a, b);
		
		System.out.println("---------------------");
		System.out.println("a  b  return");
		System.out.println("---------------------");
		
		System.out.println(a + "  " + b + "  " + r);
	}

}
