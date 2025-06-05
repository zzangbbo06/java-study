package sec01.exam10.quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Quiz1 {
	// Quiz
//	FileWriter를 사용하여 
//	"C:/Temp/output.txt" 파일을 생성하고
//	output.txt 파일 안에 아래 배열의 요소를 한 줄에 하나씩 추가해주세요.
//	String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};

//  힌트: 줄바꿈하는 방법 "\r\n" 또는 "\n"
	
	public static void main(String[] args) throws Exception{
		
//		Writer writer = new FileWriter("C:/Windows/Temp/output.txt");
//		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
//		
//		for(int i = 0; i < lines.length; i++) {
//			writer.write(lines[i] + "\n");
//		}
//		writer.flush();
//		writer.close();
		
		try(Writer writer = new FileWriter("C:/Windows/Temp/output.txt")) {
			String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
			
			for(int i = 0; i < lines.length; i++) {
				writer.write(lines[i] + "\n");
			}
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
