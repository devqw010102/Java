package ArrayResult;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {80, 74, 63, 97, 88};
		
		int sum = 0;
		double avg = 0.0;
		int max = Integer.MIN_VALUE;
		
		for(int score : scores) {
			if(score > max)
				max = score;
			sum += score;
		}
		
		avg = (double) sum / scores.length;
		
		System.out.println("총점 " + sum + ", 평균 " + avg + ", 최대점수 " + max);
	}

}
