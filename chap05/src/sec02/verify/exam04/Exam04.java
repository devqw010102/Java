package sec02.verify.exam04;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i : array) {
			if(i > max)
				max = i;
		}
		
		
		System.out.println("max : " + max);
	}

}
