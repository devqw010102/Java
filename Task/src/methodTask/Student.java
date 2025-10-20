package methodTask;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
		return Float.parseFloat(String.format("%.2f", (float)getTotal() / 3));
	}
}
