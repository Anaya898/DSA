// Write a function which takes in 2 numbers and returns the greater of those two
import java.util.*;
public class greaternum {
    public static int nums(int a, int b){
        if (a>=b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=nums(a, b);
        System.out.println("The greater number is:"+x);
    }

}
