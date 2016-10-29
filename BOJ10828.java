/*
  Baekjoon Online Judge

  10828번 :: 스택
  정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. (설명 생략)
*/

import java.util.Scanner;

public class Main {
    public static int[] stack;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;
        String command;
        int index, size, top;

        n = keyboard.nextInt();
        stack = new int[n];
        command = new String();

        index = 0; size = 0; top = 0;

        for(int i=0; i<n; i++){
            command = keyboard.next();

            switch(command){
            // 정수 X를 스택에 넣는 연산이다.
            case "push":
                stack[index] = keyboard.nextInt();
                top = index;
                index++; size++;
                break;
            // 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "pop":
                if(size==0)
                    System.out.println(-1);
                else{
                    System.out.println(stack[top]);
                    stack[top] = 0;
                    index--; top--; size--;
                }
                break;
            // 스택에 들어있는 정수의 개수를 출력한다.
            case "size":
                System.out.println(size);
                break;
            // 스택이 비어있으면 1, 아니면 0을 출력한다.
            case "empty":
                if(size==0)
                    System.out.println(1);
                else
                    System.out.println(0);
                break;
            // 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "top":
                if(size==0)
                    System.out.println(-1);
                else
                    System.out.println(stack[top]);
                break;
            }

            if(index==n){
                index = 0;
                if(stack[index]!=0)
                    System.exit(-1);
            }
        }
    }
}
