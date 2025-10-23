package extendResult.exam01;

public class Entry {
	/// 필드
	String word;
	
	/// 생성자
	Entry() { }
	Entry(String w) {
		this.word = w;
	}
	
	/// 메소드
	public void printView() {
		System.out.println("***** 약어사전 *****");
		System.out.println("약어 : " + word);
	}
}
