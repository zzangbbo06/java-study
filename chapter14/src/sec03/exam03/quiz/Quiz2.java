package sec03.exam03.quiz;

import java.io.File;
import java.io.IOException;

public class Quiz2 {
	// Quiz
//	먼저 "C:\test\sub" 폴더 아래에 test1.txt, test2.txt, test3.txt 파일을 만들어주세요.
	
//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:\test\sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.
	
//	[출력]
//	C:\test\sub\2025 -> 삭제 안됨
//	C:\test\sub\test1.txt -> 삭제 완료
//	C:\test\sub\test2.txt -> 삭제 완료
//	C:\test\sub\test3.txt -> 삭제 완료
	
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\test\\sub");
		File file1 = new File("C:\\test\\sub\\text1.txt");
		File file2 = new File("C:\\test\\sub\\text2.txt");
		File file3 = new File("C:\\test\\sub\\text3.txt");
		
		dir.mkdirs();
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		FileManager fileManager = new FileManager();
		fileManager.deleteFile(dir);
		fileManager.deleteFile(file1);
		fileManager.deleteFile(file2);
		fileManager.deleteFile(file3);
		
//FileManager fileManager = new FileManager();
//		
//		File dir = new File("C:/test/sub");
//		fileManager.deleteFile(dir);
		
	}

}
