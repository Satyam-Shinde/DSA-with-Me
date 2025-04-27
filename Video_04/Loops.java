package Video_04;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
//        For loop

//        for (int i = 0; i < 4; i++) {
//            System.out.println("Hello World !!!");
//        }

//        for (int i = 0; i < 11; i++){
//            System.out.println(i);
//        }

//        While Loop
//        int i = 0;
//        while (i<11){
//            System.out.println(i);
//            i++;
//        }

//        do-while Loop
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        } while (i < 1);

        Scanner sc = new Scanner(System.in);
//        Problem 1: Print sum of first four natural number
//        System.out.print("Enter a number : ");
//        int num = sc.nextInt();
//        int sum = 0;
//        for(int i=1; i<=num; i++){
//            sum = sum + i;
//        }
//
//        System.out.println("Sum : " + sum);


//        Problem 2: Table of any number
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(num*i);
        }
    }
}
