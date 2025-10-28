package Algorithm.part0.example;

import java.util.Scanner;

public class _1157 {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i< str.length();i++){
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();  //전부 대문자로 통일
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';

        //배열에 있는 값 중 최대값 찾기
        for(int i = 0; i< 26; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);

            }else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);

    }
}
