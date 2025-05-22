package sec01.exam03_2.quiz;

public class Point3D extends Point{
	protected int z;
	
	public Point3D(int x, int y, int z) { // 값을 3개를 넘기는 객체가 있기때문에 생성자 만들어야함
		super(x,y);
		this.z = z;
	}
		
	
	@Override
	public void location() {
	System.out.println("x = " + x + ", y = " + y + ", z = " + z);    
	}	
}
