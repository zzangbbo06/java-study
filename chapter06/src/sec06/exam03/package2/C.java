package sec06.exam03.package2;

import sec06.exam03.package1.B;

public class C {
//	A a; // Error // default 접근 제한이라 다른 패키지에서 사용 불가
	B b; // import가 된다. 다른 package에 들어가 있는 클래스 사용을 위해서
}
