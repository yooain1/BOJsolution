/*
  Baekjoon Online Judge

  2579번 :: 계단 오르기
  계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다. (설명 생략)
  각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최대값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static int[] stair;
    public static int[] dp;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;

        n = keyboard.nextInt();
        stair = new int[n+1];
        dp = new int[n+1];

        stair[0] = 0;

        for(int i=1; i<n+1; i++)
            stair[i] = keyboard.nextInt();

        for(int i=1; i<=3 && i<=n; i++){
            if(i==1 || i==2)
                dp[i] = dp[i-1] + stair[i];
            else
                dp[i] = Math.max(stair[i]+dp[i-2], stair[i]+stair[i-1]);
        }

        for(int i=4; i<=n; i++)
            dp[i] = Math.max(stair[i]+dp[i-2], stair[i]+stair[i-1]+dp[i-3]);

        System.out.println(dp[n]);
    }
}
