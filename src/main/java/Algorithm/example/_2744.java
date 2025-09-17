package Algorithm.example;

import java.util.Scanner;

public class _2744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();  //공백으로 구분된 문자
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <='Z')
                System.out.print((char)('a' + ch - 'A'));  //base 인 a에서 'A'-ch만큼을 더한 소문자
            else System.out.print((char)('A' + ch - 'a'));

        }

    }
}
