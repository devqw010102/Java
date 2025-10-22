package extendTask.exam02;

public class SubHealth extends Health {
	double s_weight;
	double fat;
	String result;
	
	SubHealth(char g, double t, double w) {
		super.gender = g;
		super.tall = t;
		super.weight = w;
		this.s_weight = 0.0;
		this.fat = 0.0;
		this.result = null;
	}
	
	public void calculate() {
		if(gender == 'M') {
			s_weight = (tall - 100) * 0.9; 
		}
		else if(gender == 'F') {
			s_weight = (tall - 100) * 0.85; 
		}
		else {
			System.out.println("성별입력이 잘못됨");
			return;
		}
		
		fat = weight / s_weight * 100;
		
		if(fat <= 90) {
			result = "저체중";
		}
		else if(fat <= 110) {
			result = "정상(표준체중)";
		}
		else if(fat <= 120) {
			result = "과체중";
		}
		else if(fat <= 130) {
			result = "경도비만";
		}
		else if(fat <= 150) {
			result = "중도비만";
		}
		else if(fat > 150) {
			result = "고도비만";
		}
	}
	
	public void output2() {
		System.out.println();
		System.out.printf("당신은 비만도 %.2f 이고, %s입니다.", fat, result);
		
	}
}
