/*
  Baekjoon Online Judge

  1000번 :: A+B
  두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
    }
}
