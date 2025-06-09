package sec03.exam03.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;






public class Quiz3 {
	// Quiz
//	현재 폴더의 하위 data 폴더에 저장된 img_avatar.png 파일을 1000 바이트를 읽은 뒤, 
//	남아 있는 바이트 수를 계산하여 출력하시오. 
//	숫자만 출력하시오.
	
//	힌트: 
//	getResource().getPath(): 현재 클래스가 있는 위치에서 파일을 찾아 절대 경로로 반환하는 메소드
//	파일 입력 스트림 객체 생성 시 생성자의 매개값으로 File 객체 전달 가능
	
	public static void main(String[] args) throws Exception {
		
		File file = new File(Quiz3.class.getResource("data/img_avatar.png").getPath());
		InputStream is = new FileInputStream(file);
		byte[] buffer = new byte[1000];
		int readCharNum = is.read(buffer);
		
		is.close();
		
		System.out.println("남아 있는 바이트 수: " + (file.length() - readCharNum));
	}

}
