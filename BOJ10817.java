/*
  Baekjoon Online Judge

  10817번 :: 세 수
  세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);

        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if(a > b)
        {
            if(b > c)
                System.out.println(b);
            else if (c > a)
                System.out.println(a);
            else
                System.out.println(c);
        }else{
            if(a > c)
                System.out.println(a);
            else if (c > b)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
