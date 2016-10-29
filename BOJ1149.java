/*
  Baekjoon Online Judge

  1149번 :: RGB거리
  RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.

  각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static int[][] rgb_cost = new int[1000][3];

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;
        int r,g,b;
        int result;

        n = keyboard.nextInt();

        rgb_cost[0][0] = keyboard.nextInt();
        rgb_cost[0][1] = keyboard.nextInt();
        rgb_cost[0][2] = keyboard.nextInt();

        for(int i=1; i<n; i++){
            r = keyboard.nextInt();
            g = keyboard.nextInt();
            b = keyboard.nextInt();

            rgb_cost[i][0] = r + Math.min(rgb_cost[i-1][1], rgb_cost[i-1][2]);
            rgb_cost[i][1] = g + Math.min(rgb_cost[i-1][0], rgb_cost[i-1][2]);
            rgb_cost[i][2] = b + Math.min(rgb_cost[i-1][0], rgb_cost[i-1][1]);

        }

        result = Math.min(Math.min(rgb_cost[n-1][0], rgb_cost[n-1][1]), rgb_cost[n-1][2]);
        System.out.println(result);
    }

}
