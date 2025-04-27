package Video_04;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        HW 1: Print all even numbers till n.
//        int n = sc.nextInt();
//        for(int i=0; i<=n; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        HW 2: Run the loop on your system and analyze what happens. Try to think of the reason for the output produced.
//        for(; ;) {
//            System.out.println("Apna College");
//        }

//        HW 3: Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
//          If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//          If they enter 0 then stop.
//          If he/ she scores :
//              Marks >=90 -> print “This is Good”
//              89 >= Marks >= 60 -> print “This is also Good”
//              59 >= Marks >= 0 -> print “This is Good as well”
//	        Because marks don’t matter but our effort does.

        boolean x = true;
        int sum = 0;
        int i = 0;
        float avg = 0;
        do {
            System.out.println("Enter an Option (Either 0 or 1) : ");
            int opt = sc.nextInt();
            if(opt == 0){
                System.out.println("Average : "+ avg);
                x = false;
            } else if(opt == 1){
                System.out.print("A : ");
                int a = sc.nextInt();
                i++;
                sum = sum + a;
            } else{
                System.out.println("Enter either 0 or 1");
            }
        } while (x);
        if (i > 0) {
            avg = (float) sum / i;
            System.out.println("Average: " + avg);

            if (avg >= 90) {
                System.out.println("This is Good");
            } else if (avg >= 60 && avg <= 89) {
                System.out.println("This is also Good");
            } else if (avg >= 0 && avg <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Marks don’t matter but our effort does.");
            }
        } else {
            System.out.println("No marks entered. Marks don’t matter but our effort does.");
        }

    }
}
