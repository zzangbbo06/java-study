package sec02.exam03;

public class ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		// new 연산자로 배열 생성
//		int[] arr1 = new int[] {1,2,3}; // 값을 알때 
//		int[] arr1 = {1,2,3};
//		int[] arr1;
//		arr1 = {1,2,3}; // 허용 안함
		
		int[] arr1 = new int[3]; // [길이] -> 값을 알 수 없을때는 길이를 적어줘야함
		
		// 배열 생성 시 기본값(초기값) 확인
		for(int i = 0; i< arr1.length; i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]); // 값을 넣어주지 않으면 int의 기본값은 0이므로 0이 들어감
		}
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			
			for(int i = 0; i< arr1.length; i++) {
				System.out.println("arr1[" + i +"] : " + arr1[i]);
			}
			
			System.out.println();
			
//			double[] arr2 = new double[] {0.1,0.2,0.3};
			double[] arr2 = new double[3];
			for(int i = 0; i< arr2.length; i++) {
				System.out.println("arr2[" + i +"] : " + arr2[i]);
			}
			
			arr2[0] = 0.1;
			arr2[1] = 0.2;
			arr2[2] = 0.3;
			
			for(int i = 0; i< arr2.length; i++) {
				System.out.println("arr2[" + i +"] : " + arr2[i]);
			}
			
			System.out.println();
			
			String[] arr3 = new String[3];
			for(int i = 0; i < arr3.length; i++) {
				System.out.println("arr3[" + i +"] : " + arr3[i]);
			}
			
			arr3[0] = "1월";
			arr3[1] = "2월";
			arr3[2] = "3월";
			
			for(int i = 0; i < arr3.length; i++) {
				System.out.println("arr3[" + i +"] : " + arr3[i]);
			}
			
			// 정리:
			// 배열은 값 목록을 이용해서 생성 또는 길이를 지정하여 배열 객체를 생성
			// 배열은 처음 생성 시 길이가 정해지면 변경 불가
			// 배열 생성 시 지정된 타입으로만 저장 가능
	}
}
