package Algorithm.part0.Queue;

import Algorithm.part0.Stack.MyArrayStack;

public class Palindrom {
    private static boolean isPalindrom(String str) {
        MyArrayStack<Character> stack = new MyArrayStack();
        MyLinkedQueue<Character> queue = new MyLinkedQueue();

        for(int i=0;i < str.length(); i++){
            stack.push(str.charAt(i));   //문자열 A의 i번째 문자
            queue.enQueue(str.charAt(i));
        }
        while(!stack.isEmpty() && stack.pop() == queue.deQueue()){
        }
        if(stack.isEmpty()){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Palindrom check!");
        String str = "lioninoil";  //테스트 문자열
        boolean t = isPalindrom(str);
        System.out.println(str + " is Palindrom?: " + t);
    }
}
