import java.util.*;
public class powers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        double x=sc.nextInt();

        System.out.println("Enter the power: ");
        double n=sc.nextInt();

        double a=Math.pow(x,n);
        
        System.out.println("The answer is: "+a);
    }

}
