package extendTask.exam02;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** 비만도 Check *****");
		Health h = new Health();
		h.input();
		
		h.output1();
		SubHealth sh = new SubHealth(h.gender, h.tall, h.weight);
		sh.calculate();
		sh.output2();
	}

}
