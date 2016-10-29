/*
  Baekjoon Online Judge

  8393번 :: 합
  n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num, result;
        int i;
        Scanner keyboard = new Scanner(System.in);

        num = keyboard.nextInt();

        result = 0;

        for(i=num; i>0; i--)
        {
            result += num;
            num--;
        }

        System.out.println(result);
    }
}
