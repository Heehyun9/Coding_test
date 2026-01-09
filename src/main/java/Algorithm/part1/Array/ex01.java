package Algorithm.part1.Array;

import java.util.Arrays;

public class ex01 {
    // 문제 : 정수 배열을 정렬해서 반환하는 solution()함수 작성
    // 제약 조건
    // 1. 정수 배열의 길이(데이터 개수)는 2 이상 10^^5 이하
    // 2. 정수 배열의 각 데이터 값은 -10^^5 이상 10^^5 이하

    // 데이터의 개수가 10만 이므로 O(NlogN)이하의 알고리즘 작성

    private static int[] solution(int[] arr){
        Arrays.sort(arr);   //O(NlogN)
        return arr;
    }

    //원본 배열을 그대로 두고 정렬하기
    private static int[] solution2(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}

