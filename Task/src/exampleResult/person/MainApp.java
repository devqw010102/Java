package exampleResult.person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("홍길동", 25);
		
		p1.printInfo();
		
//		p1.name =  "김철수";	// compile error
		p1.setName("김철수");
		p1.setAge(30);
		
		System.out.println("변경된 이름 : " + p1.getName());
		System.out.println("변경된 나이 : " + p1.getAge());
		
		p1.setName("");
		p1.setAge(-5);
		p1.printInfo();
	}

}
