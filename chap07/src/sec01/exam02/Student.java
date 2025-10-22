package sec01.exam02;

public class Student extends People{
	// 필드
	public int studentNo;	// 모두에게 접근가능한 인스턴스 필드					
	
	// 생성자
	// 매개변수 3개인(name, ssn, studentNo) 생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
