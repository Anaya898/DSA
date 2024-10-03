// take array from user as input, find x and print its index

import java.util.*;
public class arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for array: ");
        int array=sc.nextInt();
        int arr[]=new int[array];

        for (int i=0;i<array;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to find");
        int x=sc.nextInt();
        int flag=0;
        int k=0;
        for (int i=0;i<array;i++){
            if(arr[i]==x){
                flag=1;
                i++;
            }
            else{
                flag=0;
            }
            // for index
            k=i;
            } 
            if (flag==1){
                System.out.println("Number found: ");
                System.out.println(x);
                System.out.println(k);
            }
            else {
                System.out.println("Number not found");
            }
    }

    
}
