import java.util.*;/**
 * usernums
 */
public class users {

    public static void main(String[] args) {
        int pos=0;
        int neg=0;
        int zero=0;
        while (true) {
            
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number or enter 'e' to exit");
        String input =sc.next();

        if (input.equalsIgnoreCase("e")){
            break;
        }
        try {
            int num=Integer.parseInt(input);
            if (num>0){
                pos+=1;
            }
            else if (num==0) {
                zero+=1;
            }
            else{
                neg+=1;
            }

        } catch (NumberFormatException e){
            System.out.println("Invalid--");
        }

        
    }
    System.out.println("positive numbers: "+pos);
    System.out.println("negative numbers: "+neg);
    System.out.println("Zeros: "+zero);
}
}