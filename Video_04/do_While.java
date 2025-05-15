import java.util.Scanner;

public class do_While {
    public static void main(String [] args){
        // int i =0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<10);
        
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
        } while (num != 0);
    }
    
}
