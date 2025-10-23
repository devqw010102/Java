package extendResult.exam01;

public class SubEntry extends Entry {
	/// 필드
	String definition;
	int year;
	
	/// 생성자
	SubEntry(String w) {
		super(w);
	}
	SubEntry(String w, String d, int y) {
		super(w);
		this.definition = d;
		this.year = y;
	}
	
	/// 메소드
	/// 오버라이딩 된 메소드
	@Override
	public void printView() {
		super.printView();
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
}
