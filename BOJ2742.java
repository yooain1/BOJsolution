/*
  Baekjoon Online Judge

  2742번 :: 기찍 N
  자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();

        for(; n>0; n--){
            System.out.println(n);
        }
    }

}
