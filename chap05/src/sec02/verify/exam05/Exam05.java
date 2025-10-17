package sec02.verify.exam05;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;
	
		
		int n = 0;

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				n++;
			}
		}
		avg = (double) sum / n;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
