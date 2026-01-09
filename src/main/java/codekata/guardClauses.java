package codekata;

import java.util.List;

public class guardClauses{
    static double calculateAverage(List<Integer> numbers){
        if(numbers == null)
            return 0;   //보호 구문 1

        if(numbers.isEmpty())
            return 0;  //보호 구문 2

        int total = numbers.stream().mapToInt(i -> i).sum();  //예외 처리 후 기능 구현
        return (double) total / numbers.size();
    }

}
