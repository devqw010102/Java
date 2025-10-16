package sec02.example;

public class StudentPerScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score1 = new int[5];
		
		score1[0] = 10;
		score1[1] = 20;
		score1[2] = 30;
		score1[3] = 40;
		score1[4] = 50;
		
		// Student 
		// name, koreanScore, englishScore, mathScore
		// total(), average()
		Student[] score2 = new Student[5];		// Object array
		
		for(int i = 0; i < score2.length; i++) {
			score2[i] = new Student();
		}
		
		int sum = 0;
		double avg = 0;
		
		score2[0].name = "김영희";
		score2[0].englishScore = 89;
		score2[0].koreanScore = 90;
		score2[0].mathScore = 70;
		
		sum = score2[0].total();
		avg = score2[0].average();	
		
		System.out.println(score2[0].name + "의 총점은 " + sum + "이고, 평균은 " + avg + " 입니다.");
		
	}

}
