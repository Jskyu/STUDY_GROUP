package week01.ksc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        System.out.println("두번째 수를 입력하세요");
        int s2 = sc.nextInt();
        System.out.println("연산기호를 입력하세요. +,-,*,/");
        String sachik = sc.next();
        if (sachik.equals("+")) {
            System.out.println("결과는 " + (s1 + s2) + "입니다.");
        } else if (sachik.equals("-")) {
            System.out.println("결과는 " + (s1 - s2) + "입니다.");
        } else if (sachik.equals("*")) {
            System.out.println("결과는 " + (s1 * s2) + "입니다.");
        } else if (sachik.equals("/")) {
            try {
                System.out.println("결과는" + (s1 / s2) + "입니다.");
            } catch (ArithmeticException ar) {
                System.out.println("0으로 나눌수 없음");
            }
        }

    }


}
