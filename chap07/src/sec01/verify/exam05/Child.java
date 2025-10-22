package sec01.verify.exam05;

public class Child extends Parent{
	private String name;
	
	public Child() {
		// super(); 가 생략되어있음
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
