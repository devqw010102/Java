package extendTask.exam01;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubEntry se = new SubEntry("OOP", "Object Oriented Programming", 1991);
		
		se.printView();
		
		SubEntry test = new SubEntry("Test", "for SubEntry", 2025);
		test.printView();
	}

}
