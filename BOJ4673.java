/*
  Baekjoon Online Judge

  4673번 :: 셀프 넘버
  (설명 생략) 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
*/

public class Main {

    static int numberArray[] = new int[10036];

    public static void main(String[] args){
        for(int i = 1; i<=10000; i++){
            numberArray[nonSelfNumber(i)] = 1;
            if(numberArray[i]!=1)
                System.out.println(i);
        }
    }

    public static int nonSelfNumber(int num){
        int result = num;

        if(num>=10000){
            result += num/10000;
            num %= 10000;
        }
        if(num>=1000){
            result += num/1000;
            num %= 1000;
        }
        if(num>=100){
            result += num/100;
            num %= 100;
        }
        if(num>=10){
            result += num/10;
            num %= 10;
        }
        if(num>0){
            result += num/1;
            num %=1;
        }
        return result;
    }
}
