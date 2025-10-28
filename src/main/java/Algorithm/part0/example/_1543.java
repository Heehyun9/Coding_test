package Algorithm.part0.example;

import java.util.Scanner;

public class _1543 {
    //풀이 1번 : indexof로  찾기
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();  //공백포함가능 -> sc.nextLine()
        String word = sc.nextLine();


        int count = 0;
        int startIndex = 0;
        while(true){
            int findIndex = doc.indexOf(word,startIndex);  //없으면 -1 반환
            if(findIndex < 0)
                break;
            count++;
            startIndex = findIndex + word.length();
        }
    }
     */

    //풀이 2번 : 전체 문자열에서 찾는 문자열을 뺀 수가 전체문자열수보다 작으면, 찾는것이 있다 를 이용
    // .replace(찾는 문자열,"")로 찾는 문자열을 지워서 빼보기  ""(공백으로 반환한다--> 지운다)


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String doc = sc.nextLine();  //공백포함가능 -> sc.nextLine()
            String word = sc.nextLine();

            String replaced = doc.replace(word,"");
            int count = (doc.length() - replaced.length()) / word.length();
            System.out.println(count);

        }

}
