package Video_07;

import java.util.Scanner;

public class Problem_08 {
//    Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();

        int gcd = GCD(a,b);
        System.out.println("GCD : " + gcd);
    }
}
