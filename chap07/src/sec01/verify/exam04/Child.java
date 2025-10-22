package sec01.verify.exam04;

public class Child extends Parent {
	/// 필드
	private int studentNo;

	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
}
