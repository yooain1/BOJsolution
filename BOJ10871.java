/*
  Baekjoon Online Judge

  10871번 :: X보다 작은 수
  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, x;
        int[] array;
        int i;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();
        x = keyboard.nextInt();

        array = new int[n];

        for(i=0; i<n; i++)
            array[i] = keyboard.nextInt();

        for(i=0; i<n; i++){
            if(array[i] < x)
                System.out.print(array[i]+" ");
        }

    }
}
