package com.gn.homework.dimensional;

import java.util.Random;
import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

        String[] choices = {"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // 카운터 변수들
        int victory = 0;
        int equal = 0;
        int lose = 0;
        int count = 0;

        for (int i = 0; ; i++) {
            String computer = choices[rand.nextInt(choices.length)];

            System.out.print("가위바위보 : ");
            String user = sc.nextLine();

            // stop 먼저 검사
            if (user.equals("stop")) {
                System.out.println("게임 종료");
                System.out.println(count + "전 " + victory + "승 " + equal + "무 " + lose + "패");
                
                break;
            }

            // 유효한 입력이 아니면 안내
            if (!(user.equals("가위") || user.equals("바위") || user.equals("보"))) {
                System.out.println("다시 입력하세요.");
                continue; // 이 아래 실행하지 않고 다음 판으로 넘어감
            }

            System.out.println("사용자 : " + user);
            System.out.println("컴퓨터 : " + computer);

            count++;

            if (computer.equals(user)) {
                System.out.println("비겼습니다.");
                equal++;
            } else if (user.equals("가위")) {
                if (computer.equals("바위")) {
                    System.out.println("응 니가 짐");
                    lose++;
                } else if (computer.equals("보")) {
                    System.out.println("응 니가 이김");
                    victory++;
                }
            } else if (user.equals("바위")) {
                if (computer.equals("보")) {
                    System.out.println("응 니가 짐");
                    lose++;
                } else if (computer.equals("가위")) {
                    System.out.println("응 니가 이김");
                    victory++;
                }
            } else if (user.equals("보")) {
                if (computer.equals("가위")) {
                    System.out.println("응 니가 짐");
                    lose++;
                } else if (computer.equals("바위")) {
                    System.out.println("응 니가 이김");
                    victory++;
                }
            }
        }
    }
}
