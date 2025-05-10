package Video_07;

import java.util.Scanner;

public class Problem_09 {
//    Write a program to print Fibonacci series of n terms where n is input by user:

    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Fib : "+ i + " : "+ Fibonacci(i));
        }
//        System.out.println("Fib : "+Fibonacci(n));
    }
}
