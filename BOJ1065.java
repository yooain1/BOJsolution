/*
  Baekjoon Online Judge

  1065번 :: 한수
  어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();
        System.out.println(arithmeticSequence(num));
    }

    public static int arithmeticSequence(int num){
        int count = 0;
        int check_num;
        int d1, d2, d3;
        int sub1, sub2;


        for(int i=1; i<=num; i++){
            check_num = i;

            if(i<100){
                count++;
            }else if(i<1000){
                d1 = check_num/100; check_num %= 100;
                d2 = check_num/10; check_num %= 10;
                d3 = check_num/1; check_num %= 1;

                sub1 = d3-d2;
                sub2 = d2-d1;

                if(sub1==sub2)
                    count++;

            }else if(i==1000){
                return count;
            }
        }

        return count;
    }
}
