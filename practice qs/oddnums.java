
// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class oddnums {
public static int nums(int n){
    // int i;
    int sum=0;
    for (int i=1;i<=n;i++){
        if (i%2!=0){
           sum=sum+i;
        }
    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the upper limit: ");
    int n=sc.nextInt();
    int sum=nums(n);
    System.out.println("Sum is:"+sum);
}
}
