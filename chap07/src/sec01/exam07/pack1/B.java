package sec01.exam07.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		
		A b = new A("value");
		b.field2 = "value";
		b.method1();
	}
}
