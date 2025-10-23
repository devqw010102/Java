package sec02.exam03;

public class Tire {
	
	/// 필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	/// 생성자
	/// 기본생성자 자동 추가 안됨 = 기본생성자 없음
	/// 필요하면 수동으로 추가
	/// 매개변수 2개(location, maxRotation) 
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	/// 메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
