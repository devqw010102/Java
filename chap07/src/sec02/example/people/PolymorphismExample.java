package sec02.example.people;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// 객체 타입과 참조변수 타입이 일치
		Human human = new Human();
		Female female = new Female();
		
		/// 객체 타입과 참조변수 타입이 불일치
		Human hFemale = new Female();
		Human male = new Male();
		
		human.info();
		female.info();
		hFemale.info();
		male.info();
	}

}
