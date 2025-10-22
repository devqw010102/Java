package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		/// Protected 접근제한자는 다른 Package 일때 상속 관계라면 사용 가능
		super();
		this.field = "value";
		this.method();
		
		/* compile error : Default 접근제한자는 다른 Package 사용 불가능
		this.field1 = "value";
		this.method1();
		*/
	}
}
