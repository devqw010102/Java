package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed += 10;
	}
	
	/*	compile error
	@Override 
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
