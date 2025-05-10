package Video_07;

import java.util.Scanner;
public class Problem_01 {
    public static float Average(int a, int b, int c){
//        "Enter 3 numbers from the user & make a function to print their average."
        float avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();
        float avg = Average(a,b,c);
        System.out.println("Average : " +  avg);
    }
}


