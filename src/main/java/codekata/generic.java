package codekata;

import java.util.ArrayList;
import java.util.List;

public class generic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("abc");

        int sum1 = (int) list.get(0) + (int) list.get(1);  //런타임 오류 발생 --> 코드를 실행해야만 오류 여부 확인 가능

        List<Integer> genericList = new ArrayList<>();  //<Integer>로 타입 강제 : 제네릭
        genericList.add(10);
//        genericList.add("abc");  //문법(빌드레벨) 오류 발생  --> 빌드 자체가 안되므로 런타임 버그 방지

        int sum2 = genericList.get(0) + genericList.get(1);
    }
}
