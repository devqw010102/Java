package sec01.exam02;

public class People {
	// 필드
	public String name;		// 모두에게 접근가능한 인스턴스 필드
	public String ssn;		// 모두에게 접근가능한 인스턴스 필드
	
	// 생성자
	// 매개변수 2개인(name, ssn) 생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
