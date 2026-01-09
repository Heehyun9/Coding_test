package Algorithm.part1.Array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add()로 리스트의 맨 끝에 데이터 추가
        list.add(1);
        list.add(2);
        list.add(3);

        //다른 컬렉션의 데이터로부터 초기화 : 생성자의 매개변수로 컬렉션을 넘기기
        ArrayList<Integer> list2 = new ArrayList<>(list);  //생성자의 매개변수로 list를 넘긴다.
        System.out.println(list2);

        //get()메서드로 인덱스를 통해 데이터에 접근
        System.out.println(list.get(1));  //2

        //remove() 메서드로 데이터 삭제
        list.remove(list.size()-1);  //끝에있는 데이터 삭제
        System.out.println(list); //[1,2]

        //*주의* remove 메서드는 데이터를 삭제하는 위치에 따라 데이터를 복사하는 연산이 필요 -> 시간복잡도가 O(N)까지 증가 가능

        /* Array와 ArrayList의 메서드
        arr.length() : 배열의 전체 데이터 개수
        Arrays.sort(arr) : 배열의 모든 데이터를 오름차순 정렬
        Arrays.toString(arr) : 배열의 모든 데이터를 String으로 반환
        list.size() : ArrayList의 전체 데이터 개수 반환
        list.isEmpty() : ArrayList에 저장된 데이터가 없는지 true/false
        Collection.sort(list) : ArrayList 오름차순 정렬

         */

    }
}
