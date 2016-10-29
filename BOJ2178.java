/*
  Baekjoon Online Judge

  2178번 :: 미로 탐색
  미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {
    public static int[][] map;
    public static boolean[][] check;
    public static int n, m, cnt;
    public static int[] x, y, l;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String str = new String();

        n = keyboard.nextInt();
        m = keyboard.nextInt();
        keyboard.nextLine();

        map = new int[100+n][100+m];
        x = new int[100*m]; y = new int[100*n]; l = new int[100+n*m];
        check = new boolean[100+n][100+m];

        for(int i=0; i<n; i++){
            char num;
            str = keyboard.nextLine();

            for(int j=0; j<m; j++){
                num = str.charAt(j);
                map[i][j] = Integer.parseInt(String.valueOf(num));
            }
        }

        BFS(0,0);
    }

    public static void enqueue(int _x, int _y, int _l){
        x[cnt] = _x;
        y[cnt] = _y;
        l[cnt] = _l;
        cnt++;
    }

    public static void BFS (int _x, int _y)
    {
        int pos = 0;

        enqueue(_x, _y, 1);
        check[_x][_y] = true;

        while(pos < cnt && (x[pos] != m-1 || y[pos] != n-1))
        {
            map[y[pos]][x[pos]] = 0;

            if(y[pos]>0 && map[y[pos]-1][x[pos]]==1 && check[y[pos]-1][x[pos]] == false){
                check[y[pos]-1][x[pos]] = true;
                enqueue(x[pos], y[pos]-1, l[pos]+1);
            }
            if(y[pos]<n-1 && map[y[pos]+1][x[pos]]==1 && check[y[pos]+1][x[pos]] == false){
                check[y[pos]+1][x[pos]] = true;
                enqueue(x[pos], y[pos]+1, l[pos]+1);
            }
            if(x[pos]>0 && map[y[pos]][x[pos]-1]==1 && check[y[pos]][x[pos]-1] == false){
                check[y[pos]][x[pos]-1] = true;
                enqueue(x[pos]-1, y[pos], l[pos]+1);
            }
            if(x[pos]<m-1 && map[y[pos]][x[pos]+1]==1 && check[y[pos]][x[pos]+1] == false){
                check[y[pos]][x[pos]+1] = true;
                enqueue(x[pos]+1, y[pos], l[pos]+1);
            }
            pos++;
        }
        if(pos < cnt)
            System.out.println(l[pos]);

    }
}
