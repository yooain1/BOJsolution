/*
  Baekjoon Online Judge

  1152번 :: 단어의 개수
  영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String sentence;
        char[] chr;
        int count = 0;

        sentence = keyboard.nextLine();

        chr = sentence.toCharArray();
        for(int i=0; i<chr.length; i++){
            if(chr[i] == ' '){
                if(i != chr.length-1 && chr[i+1] != ' ')
                    count++;
                else if(i == chr.length-1)
                    count += 0;
            }else{
                if(i==0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
