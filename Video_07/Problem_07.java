package Video_07;

import java.util.Scanner;

public class Problem_07 {
//    Two numbers are entered by the user, x and n. Write a function to the value of one number raised to the power of another i.e. x^n.
    public static double power(int x, int n){
        double value = 1;
        for(int i = 0; i < n; i++){
            value *= x;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int x = sc.nextInt();
        System.out.print("Enter Power : ");
        int n = sc.nextInt();

        double value = power(x, n);
        System.out.println("Base : " + x + ", Power : " + n + ", = "+ value);
    }
}
