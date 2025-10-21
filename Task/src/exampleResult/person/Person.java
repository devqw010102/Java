package exampleResult.person;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		if(name.equals("")) {
			this.name = "이름없음";
		}
		else {
			this.name = name;	
		}
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		if(age >= 0) {
			this.age = age;	
		}
	}
	
	int getAge() {
		return age;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}
