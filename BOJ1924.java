/*
  Baekjoon Online Judge

  1924번 :: 2007년
  오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int month, day;
        int someday = 0;
        int result;
        int i;
        Scanner keyboard = new Scanner(System.in);

        month = keyboard.nextInt();
        day = keyboard.nextInt();

        someday += day;

            for(i=1; i<month; i++){

                if(month==1)  break;
                else if(month==2){
                    someday += 31;  break;
                }
                else{
                    switch(i){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        someday += 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        someday += 30;
                        break;
                    case 2:
                        someday += 28;
                        break;
                    }
                }
            }

        result = someday%7;

        switch(result){
        case 1:
            System.out.println("MON");  break;
        case 2:
            System.out.println("TUE");  break;
        case 3:
            System.out.println("WED");  break;
        case 4:
            System.out.println("THU");  break;
        case 5:
            System.out.println("FRI");  break;
        case 6:
            System.out.println("SAT");  break;
        case 0:
            System.out.println("SUN");  break;
        }
    }
}
