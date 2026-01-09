package Algorithm.part1.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ex02 {

    // 배열 제어하기
    // 문제 : 정수 배열을 하나 받습니다.
    // 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution()함수를 구현

    // 제약 조건
    //1. 배열 길이는 2 이상 1000 이하 -> O(N^^2)도 가능
    //2. 각 배열의 데이터 값은 -100,000 이상 100,000 이하

    private static int[] solution(int[] arr){
        //1. 중복값 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        //2. 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());
        //3. int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int[] arr){
        //1. 중복값 제거 2. 내림차순 정렬
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num: arr){
            set.add(num);
        }

        // 3. int형 배열에 담아서 반환
        int[] result = new int[set.size()];
        for(int i = 0; i< result.length; i++){
            result[i] = set.pollFirst();
        }

        return result;

    }

    // arr의 중복 원소를 제거하는데 걸리는 시간 복잡도는 O(N)
    // 이를 다시 정렬하는데 걸리는 시간 복잡도는 O(NlogN)


}
