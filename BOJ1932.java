/*
  Baekjoon Online Judge

  1932번 :: 숫자삼각형
  (그림 생략)위 그림은 크기가 5인 숫자 삼각형의 한 모습이다.
  맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
  삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 숫자는 모두 정수이며, 범위는 0 이상 99 이하이다.
*/

import java.util.Scanner;

public class Main {

    public static int[][] triangle;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;
        int max;

        n = keyboard.nextInt();
        triangle = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                triangle[i][j] = keyboard.nextInt();
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0)
                    triangle[i][0] = triangle[i][0] + triangle[i-1][0];
                else if(j==i)
                    triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
                else
                    triangle[i][j] = triangle[i][j] + Math.max(triangle[i-1][j-1],triangle[i-1][j]);
            }
        }

        max = 0;
        for(int i=0; i<n; i++)
            max = Math.max(max, triangle[n-1][i]);

        System.out.println(max);
    }

}
