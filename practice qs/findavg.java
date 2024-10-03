// Enter 3 numbers from the user & make a function to print their average.


import java.util.*;

public class findavg {
    public static int avg(int a, int b, int c){
        int av=(a+b+c)/3;
        return av;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int av=avg(a,b,c);
        System.out.println("Average is: "+av);
}
}

