package sec03.exam04.quiz;

import java.io.File;
import java.util.UUID;

public class Quiz1 {
	// Quiz
//	디렉터리 이름으로 UUID 사용하기
//	임시 작업 디렉터리, 사용자 세션 디렉터리 등을 만들 때 UUID를 사용하면 
//	충돌 없는 고유 디렉터리를 쉽게 만들 수 있습니다.
	
//	C:\test\sub 폴더 아래에 새로운 임시 폴더를 생성하세요.
//	폴더명은 UUID를 활용하여 구성하세요.
//	단, 폴더명에 -(하이픈)은 없어야 합니다.
	
//	[출력]
//	임시 폴더 생성: C:\test\4e9719b5f849425cb62cfc2711772a6b
	
	public static void main(String[] args) {
		
		String uploadDirPath = "C:/test/sub/";
		File uploadDir = new File(uploadDirPath);
		
//		if(!uploadDir.exists()) {
//			boolean dirCreated = uploadDir.mkdirs();
//			if(!dirCreated) {
//				System.out.println("업로드 폴더 생성 실패");
//				return;
//			}
//		}
		String randomDir = UUID.randomUUID().toString();
		String [] arrayRandomDir = randomDir.split("-");
//		-> replace로 해도 된다.
		String joinedRandomDir = String.join("", arrayRandomDir);
//		System.out.println(joinedRandomDir);
	
		String savedDir =  uploadDirPath + joinedRandomDir;
		uploadDir = new File(savedDir);
		
		if(!uploadDir.exists()) {
			boolean dirCreated = uploadDir.mkdirs();
			if(!dirCreated) {
				System.out.println("업로드 폴더 생성 실패");
				return;
			}
		}
				
	}

}
