package sec06.exam02.mycompany;

//import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hankook.Tire;
//import sec06.exam02.kumho.Tire; // import문을 사용할 수 없으면 클래스의 풀네임을 사용하여 명시적으로 작성하면 됨
import sec06.exam02.hyundai.Engine;
//import sec06.exam02.kumho.BigWidthTire;
// 금호 아래에 있는것들을 다 가지고
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//	필드(집합 관계)(has -a)
	// 자동완성 기능 사용 시 자동 import 또는 단축키(ctrl + shift + o) 사용
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 한국타이어 사용
	Tire tire3 = new Tire();
	
	// 금호 타이어 사용
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); // 풀네임으로 써보기
	// import문을 사용할 수 없으면 클래스의 풀네임을 사용하여 명시적으로 작성하면 됨
	// 근데 클래스명을 동일하게 만드는 경우는 거의 없음
}
