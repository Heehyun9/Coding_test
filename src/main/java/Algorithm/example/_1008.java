package Algorithm.example;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String string_a = sc.next();
    String string_b = sc.next();

    int a = Integer.parseInt(string_a);
    int b = Integer.parseInt(string_b);
    System.out.print(a/(double)b);
    sc.close();

    }
}



