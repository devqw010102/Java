package methodResult;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		s.kor = 89;
		s.eng = 82;
		s.math = 68;
		
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}
