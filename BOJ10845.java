/*
  Baekjoon Online Judge

  10845번 :: 큐
  정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. (설명 생략)
*/

import java.util.Scanner;

public class Main {
    public static int[] queue;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int n;
        int index, size, front, rear;
        String command = new String();

        n = keyboard.nextInt();
        queue = new int[n];

        index = 0; front = 0; rear = 0; size = 0;

        for(int i=0; i<n; i++){
            command = keyboard.next();

            switch(command){
            // 정수 X를 큐에 넣는 연산
            case "push":
                queue[index] = keyboard.nextInt();
                rear = index;
                index++;
                size++;
                break;
            // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없을 경우 -1을 출력한다.
            case "pop":
                if(size==0){
                    System.out.println(-1);
                    rear = front;
                    index = front;
                }
                else {
                    System.out.println(queue[front]);
                    queue[front] = 0;
                    front++;
                    size--;
                }
                break;
            // 큐에 들어있는 정수의 개수를 출력한다.
            case "size":
                System.out.println(size);
                break;
            // 큐가 비어있으면 1, 아니면 0을 출력한다.
            case "empty":
                if(size==0)
                    System.out.println(1);
                else
                    System.out.println(0);
                break;
            // 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "front":
                if(size==0){
                    System.out.println(-1);
                    rear = front;
                    index = front;
                }
                else
                    System.out.println(queue[front]);
                break;
            // 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "back":
                if(size==0){
                    System.out.println(-1);
                    rear = front;
                    index = front;
                }
                else
                    System.out.println(queue[rear]);
                break;
            }

            if(rear==n)
                rear = 0;
            else if(front==n)
                front = 0;
        }
    }
}
