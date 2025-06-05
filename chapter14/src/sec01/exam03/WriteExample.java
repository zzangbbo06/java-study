package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Windows/Temp/test3.db");
		
		// 출력할 바이트 배열
		byte[] array = {10,20,30,40,50};
		
		// 주어진 배열의 off부터 len개 까지의 바이트를 출력
		os.write(array, 1,3);
		
		os.flush();
		os.close();

	}

}
