package Algorithm.part0.example;

import java.util.Scanner;

public class _1919 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //공백으로 구분된 한 문자열
        String b = sc.next();

        int[] countA = new int[26]; //알파벳 개수 dared :[1,0,0,2...]
        int[] countB = new int[26];

        //배열에 해당하는 알파벳의 count를 늘린다.알파벳 개수 기록하는 배열
        for(int i = 0;i<a.length();i++)
            countA[a.charAt(i)-'a']++;

        for(int i = 0;i<b.length();i++)
            countB[a.charAt(i)-'a']++;

        int ans = 0;
        for(int i = 0;i<26;i++){
            if(countA[i] > countB[i])
                ans += countA[i] - countB[i];
            else if(countB[i] > countA[i])
                ans += countB[i] - countA[i];
        }
        System.out.println(ans);
    }
}