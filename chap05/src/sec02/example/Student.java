package sec02.example;

public class Student {

	// Property (variable)
	
	String name;		// 이름
	int koreanScore;	// 국어 점수
	int englishScore;	// 영어 점수
	int mathScore;		// 수학 점수
	
	
	// Method (function)
	
	// get total score
	int total() {
		return koreanScore + englishScore + mathScore;
	}
	// get average
	double average() {
		return (double) (koreanScore + englishScore + mathScore) / 3;
	}
}
