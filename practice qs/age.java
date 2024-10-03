import java.util.*;
public class age {
    public static int ppl(int a){
        if (a>18){
            System.out.println("person is eligible to vote");
        
        }
        else{
            System.out.println("person is not eligible to vote");
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter age of person");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int y=ppl(a);
        System.out.print("Age of person is "+y);
    }
}
