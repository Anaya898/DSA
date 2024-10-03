import java.util.*;

public class circle {
    public static double findcircum(double r){
        double circum= 2*3.14*r;
        return circum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double x=findcircum(r);
        System.out.println("The circumference of the circle is:"+x);
    }

}
