import java.util.Scanner;

class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // int age = sc.nextInt();

        // if (age >18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }

        switch(button){

            case 1: System.out.println("hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Pranam Jii");
            break;

            default : System.out.println("Invalid");
        }

    }
}