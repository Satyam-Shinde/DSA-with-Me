package Functions;

import java.util.Scanner;

public class Functions {
//    public static void printMyName(String name){
//        System.out.println("My name is " + name);
//        return;
//    }
//
//    public static int add2num(int a, int b){
//        int sum = a + b;
//        return sum;
//    }

    public static int factorial(int n){
        int mult = 1;
       for(int i = n; i>= 1; i--){
           mult *= i;;
       }
        return mult;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
//        System.out.print("Enter B : ");
//        int b = sc.nextInt();
        System.out.println("Factorial : " + factorial(a));
    }
}
