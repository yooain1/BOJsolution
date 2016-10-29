/*
  Baekjoon Online Judge

  1008번 :: A/B
  A/B를 계산하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double a,b;
        double result;

        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();

        result = a/b;
        System.out.format("%.9f", result);
    }
}
