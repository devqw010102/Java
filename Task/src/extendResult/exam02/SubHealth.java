package extendResult.exam02;

public class SubHealth extends Health {

	/// 필드
	double s_weight;		// 표준체중
	double fat;				// 비만도
	String result;			// 결과값
	
	/// 생성자
	SubHealth() {
		s_weight = 0.0;
		fat = 0.0;
		result = null;
	}
	
	/// 메소드
	/// 비만도 계산
	void calculate() {
		if(gender == 'M') {
			s_weight = (tall - 100) * 0.9;	
		}
		else if(gender == 'F') {
			s_weight = (tall - 100) * 0.85;
		}
		else {
			System.out.println("M/F 중 하나를 선택하세요.");
		}
		
		fat = (weight / s_weight) * 100;
		
		if(fat >= 150) 
			result = "고도비만";
		else if(fat >= 131)
			result = "중도비만";
		else if(fat >= 121) 
			result = "경도비만";
		else if(fat >= 111) 
			result = "과체중";
		else if(fat >= 91)
			result = "정상(표준체중)";
		else
			result = "저체중";
	}

	/// 출력
	void output2() {
		System.out.printf("당신은 비만도 %.2f이고, %s 입니다.", fat, result);
	}
}
