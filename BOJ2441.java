/*
  Baekjoon Online Judge

  2440번 :: 별찍기 - 4
  첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
  하지만, 오른쪽을 기준으로 정렬한 별 (예제 참고)을 출력하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n, i, j;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();

        for(i=0; i<n; i++){
            for(j=0; j<i; j++)
                System.out.print(" ");
            for(j=n-i; j>0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
