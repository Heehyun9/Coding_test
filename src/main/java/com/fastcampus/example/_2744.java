package com.fastcampus.example;

import java.util.Scanner;

public class _2744 {
    public static void main(String[] args) {

        //대소문자 차이 구하기
        int k = 'A' - 'a';

        //1. Scanner 호출
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //2. 문자열을 char array로 분할
        char[] inputCharArray = input.toCharArray();

        //3. for문으로 문자가 65-90이면 +32
        // 97-122이면 -32

        for(int i = 0;i <inputCharArray.length; i++){
            if(inputCharArray[i]>= 'a' && inputCharArray[i] <= 'z'){
                inputCharArray[i] += k;  //소문자를 대문자로 변환
            }else if (inputCharArray[i] >= 'A' && inputCharArray[i] <= 'z'){
                inputCharArray[i] -= k;  //대문자를 소문자로 변환
            }
        }

        //4.출력하기
        System.out.println(inputCharArray);
        sc.close();
    }
}
