package Algorithm.example;

import java.util.Scanner;

public class _1919 {
    public static void main(String[] args) {

        //1. 두 단어 입력 받기
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        char[] a = sc1.toCharArray();
        String sc2 = sc.nextLine();
        char[] b = sc2.toCharArray();
        System.out.println(a);
        System.out.println(b);


        //2. 안맞는 개수 담을
        int k = 0;
        int count = 0;

        //3. 첫번째 단어를 두번째 단어와 비교하기
        for (int i = 0; i < a.length; i++) {
            k = 0;  //초기화
            for (int j = 0; j < b.length; j++) {

                if (a[i] != b[j]) k++;
                if(k == a.length) count++;
            }
        }
        //4. 두번째 단어를 첫번째 단어와 비교하기
        for (int m = 0; m < b.length; m++) {
            k = 0;  //초기화
            for (int l = 0; l < a.length; l++) {

                if (a[m] != b[l]) k++;
                if(k == b.length) count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}