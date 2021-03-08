package week01.kdw;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오 : ");
        int n = sc.nextInt();
        System.out.print("연산자를 입력하시오 : ");
        String x = sc.next();
        System.out.print("정수를 입력하시오 : ");
        int m = sc.nextInt();

        if(x.equals("+")) {
            System.out.println(n+"+"+m+"="+(n+m));
        }
        else if(x.equals("-")) {
            System.out.println(n+"-"+m+"="+(n-m));
        }
        else if(x.equals("")) {
            System.out.println(n+""+m+"="+(n*m));
        }
        else if(x.equals("/")) {
            if(m == 0)
                System.out.print("0으로는 나눌수가 없습니다.");
            else
                System.out.println(n+"/"+m+"="+(n/m));
        }

        sc.close();
    }
}