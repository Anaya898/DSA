public class gcd {
    // Write a function that calculates the Greatest Common Divisor of 2 numbers
    public static void main(String[] args) {
        
        int a=15;
        int b=20;
        int small= (a<b)?a:b;
        int gcd=1;
        for(int i=1;i<small;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        System.out.println("LCM:" + a*b/gcd);
    }
}
