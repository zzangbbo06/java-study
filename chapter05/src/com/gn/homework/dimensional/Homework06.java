package com.gn.homework.dimensional;

import java.util.Scanner;
import java.util.Arrays;

public class Homework06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int stringNum = sc.nextInt();
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

            } else if (answer.equalsIgnoreCase("N")){
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
