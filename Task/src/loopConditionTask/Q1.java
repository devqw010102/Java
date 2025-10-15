package loopConditionTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("입력");
			int num = Integer.parseInt(scanner.nextLine());
			int count = 0;
			ArrayList<Integer> list = new ArrayList<>();
			
			if(num == 0) {
				break;
			}
			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					list.add(i);
					count++;
				}
			}
			
			System.out.print("{ ");
			for(int i = 0; i < list.size() - 1; i++) {
				System.out.print(list.get(i) + ", ");
			}
			System.out.println(list.get(list.size() - 1) + "}");
			System.out.println("약수의 개수는 " + count + "개 입니다.");
		}
		
		
		scanner.close();
	}

}
