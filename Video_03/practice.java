import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // check positive negative number
        // System.out.println("Enter The Number:");
        // int a = sc.nextInt();

        // if(a > 0){
        //     System.out.println("Positive Number");
        // }else if (a==0) {
        //     System.out.println("This is zero");
        // }
        // else{
        //     System.out.println("Negative number");
        // }

        System.out.println("Enter a day number(1-7): ");
        int day = sc.nextInt();

        switch(day){
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("tuesday");
            break;

            case 3:System.out.println("Wednesday");
            break;

            case 4: System.out.println("thursday");
            break;

            case 5: System.out.println("Friday");
            break;

            case 6: System.out.println("Saturday");
            break;

            case 7: System.out.println("Sunday");
            break;

            default: System.out.println("Invalid number");

        }

    }


}
