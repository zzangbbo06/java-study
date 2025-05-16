package com.gn.homework.loop;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        // 1~50 사이 정수 입력받기 (범위 안 들어오면 계속 묻기)
        while (true) {
            System.out.print("1~50 사이의 정수를 입력하세요 : ");
            num = sc.nextInt();

            if (num >= 1 && num <= 50) {
                break; // 올바른 입력이면 반복 종료
            } else {
                System.out.print("");
            }
        }

        int sum = 0;

        for (int j = 0; j <= num; j++) {
            if (j % 2 == 0) {
                sum += j;
            }
        }

        System.out.println("1부터 " + num + "까지의 짝수 합계 : " + sum);
    }
}