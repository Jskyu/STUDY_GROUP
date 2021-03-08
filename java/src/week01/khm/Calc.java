package week01.khm;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum;

        System.out.print("숫자를 입력하시오: ");
        int x = sc.nextInt();
        System.out.print("숫자를 입력하시오: ");
        int y = sc.nextInt();
        System.out.print("수식을 입력하시오: ");
        String z = sc.next();

        if (z.equals("+")) {
            sum = x + y;
            System.out.print("결과값은" + sum + "입니다");
        }
        else if (z.equals("-")) {
            sum = x - y;
            System.out.print("결과값은" + sum + "입니다");
        }
        else if (z.equals("*")) {
            sum = x * y;
            System.out.print("결과값은" + sum + "입니다");
        }
        else if (z.equals("/")) {
            sum = x / y;
            System.out.print("결과값은" + sum + "입니다");
        }

        sc.close();
    }
}
