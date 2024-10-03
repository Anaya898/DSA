import java.util.*;/**
 * sum
 */
public class sum {
public static int calc(int a, int b){
    int sum=a+b;
    return sum;
}

// public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input for new number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calc(a,b);
        System.out.println("Sum is "+sum);

    }

    

}
