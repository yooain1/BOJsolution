/*
  Baekjoon Online Judge

  2739번 :: 구구단
  N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, i;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();

        for(i=1; i<=9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
