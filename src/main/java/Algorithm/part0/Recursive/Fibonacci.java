package Algorithm.part0.Recursive;

public class Fibonacci {

    // 재귀호출로 fibonacci 구현 : 직관적 파악 가능
    public int fibonacciRecur(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        return fibonacciRecur(num-1) + fibonacciRecur(num -2);
    }

    // fibonacci는 반복문으로 만드는 것이 더 효율적
    public int fibonacciIter(int num){

        int ppre = 0;
        int pre = 1;
        int current = 0; //반환값 (tmp 역할)

        if(num == 0) return 0;
        if(num == 1) return 1;

        for(int i = 2; i <= num; i++){
            current = ppre + pre;
            ppre = pre;
            pre = current;
        }
        return current;
    }

    // 동적프로그래밍 : 부분의 결과를 저장했다가 사용하여 해결 / 작은 문제의 답이 큰 문제에 포함된 경우

    public int fibonacciMem(int n){
        int[] value = new int[n+1];

        value[0] = 0;
        value[1] = 1;

        if(n == 0) return value[0];
        if(n == 1) return value[1];

        int i;
        for(i = 2; i <= n; i++){
            value[i] = value[i-1] + value[i-2];
        }

        return value[i-1];
    }




    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecur(7);
        System.out.println(sum);

        sum = fibonacci.fibonacciIter(7);
        System.out.println(sum);

        sum = fibonacci.fibonacciMem(7);
        System.out.println(sum);


    }


}
