package extendTask.exam01;

public class SubEntry extends Entry {

	String definition;
	int year;
	
	SubEntry(String w) {
		
	}
	
	SubEntry(String w, String d, int y) {
		super(w);
		this.definition = d;
		this.year = y;
	}
	
	@Override
	public void printView() {
		// TODO Auto-generated method stub
		super.printView();
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year + "년");
	}
	
	
}
