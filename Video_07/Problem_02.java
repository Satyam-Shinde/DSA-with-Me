package Video_07;
import java.util.Scanner;
public class Problem_02 {
//  Write a function to print the sum of all odd numbers from 1 to n.
    public static int SumOfOdd(int n){
        int sum = 0;
        for(int i = 1; i <= n;i++){
            if(i % 2 != 0){
                sum = sum + i;
            } else {
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = SumOfOdd(n);
        System.out.println("Sum : " + sum);
    }
}
