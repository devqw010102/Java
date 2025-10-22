package extendTask.exam01;

public class Entry {
	String word;
	
	Entry() {
		
	}
	
	Entry(String w) {
		this.word = w;
	}
	
	public void printView() {
		System.out.println("***** 약어사전 *****");
		System.out.println("약어 : " + word);
	}
	
	
}
