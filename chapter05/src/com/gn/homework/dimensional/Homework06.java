package com.gn.homework.dimensional;

import java.util.Scanner;
import java.util.Arrays;

public class Homework06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int stringNum = sc.nextInt();
        // nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼(임시 저장 공간)에 남김
        // 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
        // 해결법: 중간에 nextLine()을 한 번 호출해 버퍼 정리
        // 이상태로 nextLine로 가져오게 되면 그대로 다 들어감
        sc.nextLine(); // 개행 문자 제거

        String[] strArray = new String[stringNum];

        // 초기 문자열 입력
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i + 1) + "번째 문자열 : ");
            strArray[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("배열에 값을 추가하시겠습니까? (Y/N) : ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("몇 개를 추가하시겠습니까? : ");
                int addCount = sc.nextInt();
                sc.nextLine(); // 개행 제거

                // 배열 크기 증가 및 복사
                strArray = Arrays.copyOf(strArray, strArray.length + addCount);

                // 추가 입력 받기
                for (int i = strArray.length - addCount; i < strArray.length; i++) {
                    System.out.print((i + 1) + "번째 문자열 : ");
                    strArray[i] = sc.nextLine();
                }

            } else if (answer.equalsIgnoreCase("N")){ //equalsIgnoreCase쓰면 대문자, 소문자 사용 구분안한다는 이야기
                System.out.println("최종 배열 값 :");
                for (int i = 0; i < strArray.length; i++) {
                    System.out.println((i + 1) + "번째 : " + strArray[i]);
                }
                break;

            } else {
                System.out.println("입력할 수 없는 값입니다.");
            }
        }

        sc.close();
    }
}
