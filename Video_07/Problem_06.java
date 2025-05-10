package Video_07;

import java.util.Scanner;

public class Problem_06 {
//    Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void CountNum(){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        Scanner sc = new Scanner(System.in);

        String choice;
        do {
            System.out.print("Enter a Number : ");
            int num = sc.nextInt();
            if(num > 0){
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.print("Want to Continue : ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Positive : "+ positive);
        System.out.println("Negative : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }

    public static void main(String[] args) {
        CountNum();
    }
}
