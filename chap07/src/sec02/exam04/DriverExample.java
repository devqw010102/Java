package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// DriverExample.class 와 Driver.class 간의 집합관계
		Driver driver = new Driver();
		
		/// DriverExample.class 와 Bus.class 간의 집합관계
		Bus bus = new Bus();
		/// DriverExample.class 와 Taxi.class 간의 집합관계
		Taxi taxi = new Taxi();
		// 매개변수의 다형성.
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
