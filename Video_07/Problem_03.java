package Video_07;

import java.util.Scanner;

public class Problem_03 {
//    Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greaterThan(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();

        int greater = greaterThan(a,b);
        System.out.println("Greater : "+ greater);

    }
}
