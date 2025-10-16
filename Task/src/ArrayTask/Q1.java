package ArrayTask;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];

		scores[0] = 80;
		scores[1] = 74;
		scores[2] = 63;
		scores[3] = 97;
		scores[4] = 88;
		
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		for(int score : scores) {
			if(score > max)
				max = score;
			sum += score;
		}
		
		avg = (double) sum / scores.length;
		
		System.out.println("총점 " + sum + ", 평균 " + avg + ", 최대점수 " + max);
		
	}

}
