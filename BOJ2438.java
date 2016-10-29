/*
  Baekjoon Online Judge

  2438번 :: 별찍기 - 1
  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, i, j;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();

        for(i=1; i<=n; i++){
            for (j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
