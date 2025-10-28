package Algorithm.part1.Array;

import java.util.Scanner;

public class _10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        // for(int p = P; p> 0 ; p--)와 동일
        while(P --> 0) {
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++)
                h[i] = sc.nextInt();
            //1. 줄 서있는 학생 중 자신보다 큰 학생을 찾는다.
            //1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
            //2. 찾으면, 그 학생의 앞에 선다.
            // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.

            int cnt = 0;
            for(int i = 0;i < 20; i++){
                for(int j = 0; j< i;j++){
                    if(h[j] > h[i]){
                        int myH = h[i];
                        for(int k = i; k > j; k--){
                            h[k] = h[k-1];
                            cnt++;
                        }
                        h[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(T + " " + cnt);
        }

    }
}
