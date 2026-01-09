package Algorithm.part1.Array;

import java.util.HashSet;

public class ex03 {

    // 문제 : 정수 배열 numbers 가 주어집니다. numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해
    //만들수 있는 모든 수를 배열의 오름차순으로 담아 반환하는 solution() 함수 만들기

    // 제약 조건
    //1. numbers의 길이는 2 이상 100 이하
    //2. numbers의 모든 수는 0 이상 100 이하

    public static int[] solution(int[] arr){
        // 1. 중복값 제거를 위한 해시셋 생성
        HashSet<Integer> set = new HashSet<>();

        // 2. 두 수를 선택하는 모든 경우의 수를 반복문으로 구함
        for(int i = 0; i< arr.length -1; i++){
            for(int j = i+1; j< arr.length; j++){
                //3. 두 수를 더한 결과를 해시셋에 추가
                set.add(arr[i] + arr[j]);
            }
        }

        // 4. 해시셋의 값을 오름차순 정렬하고 int[] 형태의 배열로 변환하여 반환
        return set.stream().sorted()
                .mapToInt(Integer::intValue).toArray();
    }

}
