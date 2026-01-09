package Algorithm.part1.Array;

public class array {
    public static void main(String[] args) {
        //자바에서는 int형 배열의 기본값을 0으로 초기화한다.
        int[] arr = {0,0,0,0,0,0};
        int[] arr2 = new int[6];

        // 2차원 배열
        //2차원 배열 생성
        int[][] arr3 = {{1,2,3},{4,5,6}};
        //arr[1][2]에 저장된 값을 출력
        System.out.println(arr3[1][2]); //6
        //arr[1][2]에 저장된 값을 7로 변경
        arr3[1][2] = 7;

        //행과 열 순서로 사용


    }
}
