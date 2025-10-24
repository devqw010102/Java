package sec02.verify.exam02;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;		// 참조 자동 타입 변환
		
		snowTire.run();
		tire.run();
	}

}
