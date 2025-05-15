import java.util.Scanner;

public class forLoop {
    public static void main(String[] args){
        // for(int i=0 ; i<10;i++){
        //     System.out.println(i);
        // }
        
        //printeven number
        // for(int i =0; i<20; i+=2){
        //     System.out.println(i);
        // }

        //print reverse number (10-1)

        // for(int i=10; i>1 ;i--){
        //     System.out.println(i);

        // }

        //calculate the first 10 natural number sum
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        
        for(int i=0; i<n; i++){
            sum=sum+n;         //if n=5 ;4 0+1+2+3+4+5=15
        }
        System.out.println(sum);
    }
}
