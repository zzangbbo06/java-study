package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
	
		Writer writer = new FileWriter("C:/Windows/Temp/test7.txt");
		
		char[] array = {'A','B','C'};
		
		// 배열의 모든 문자를 출력
		writer.write(array);
		writer.flush();
		writer.close();
		
	
	
	}	
}
