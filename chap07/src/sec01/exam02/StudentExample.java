package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student 클래스의 매개변수 3개인 생성자 호출
		// Student(name, ssn, studentNo)
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}

}
