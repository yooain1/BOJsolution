/*
  Baekjoon Online Judge

  10869번 :: 사칙연산
  두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        int a, b;
        Scanner keyboard = new Scanner(System.in);

        a = keyboard.nextInt();
        b = keyboard.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
