package sec06.exam05.package1;

import sec06.exam05.package1.A;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
		a.method2();
//		a.method3();
	}
		public void method1() {
			A a = new A();
			a.field1 = 1;
			a.field2 = 1;
//			a.field3 = 1;
			
			a.method1();
			a.method2();
//			a.method3();
	}
}
