package example.person;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}


	// Setter
	public void setName(String name) {
		this.name = (name.equals("")) ? "이름없음" : name;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
}
