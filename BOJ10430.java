/*
  Baekjoon Online Judge

  10430번 :: 나머지
  (A+B)%C는 (A%C + B%C)%C와 같을까?
  (AxB)%C는 (A%C x B%C)%C와 같을까?
  세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main (String [] args)
    {
        int a, b, c;
        int result;
        Scanner keyboard = new Scanner(System.in);

        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        result = (a+b)%c;
        System.out.println(result);
        result = ((a%c)+(b%c))%c;
        System.out.println(result);
        result = (a*b)%c;
        System.out.println(result);
        result = ((a%c)*(b%c))%c;
        System.out.println(result);

    }
}
