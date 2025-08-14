package Algorithm.example;

import java.util.Scanner;

public class _1157 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("문자열을 입력하세요: ");
            String input = sc.next();
            sc.close();

            // 알파벳 개수 저장 (A-Z → 0~25)
            int[] count = new int[26];

            // 소문자/대문자 상관없이 카운트
            for (char c : input.toCharArray()) {
                c = Character.toUpperCase(c); // 소문자면 대문자로 변환
                if (c >= 'A' && c <= 'Z') {   // 알파벳인 경우만 카운트
                    count[c - 'A']++;
                }
            }

            // 가장 많이 나온 알파벳 찾기
            int maxCount = 0;
            char maxChar = '?';
            boolean duplicate = false;

            for (int i = 0; i < 26; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    maxChar = (char) (i + 'A');
                    duplicate = false;
                } else if (count[i] == maxCount) {
                    duplicate = true; // 동점인 경우 표시
                }
            }

            // 결과 출력
            if (duplicate) {
                System.out.println("?");
            } else {
                System.out.println(maxChar);
            }
        }
}
