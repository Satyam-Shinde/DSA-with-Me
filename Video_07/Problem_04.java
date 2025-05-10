package Video_07;

import java.util.Scanner;

public class Problem_04 {
//    Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumference(int r){
        return 2 * 3.14 * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        double circum = circumference(r);
        System.out.print("Circumference : " + circum);
    }
}
