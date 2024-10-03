public class loops {
    public static void main(String args[]){
        // int num=1;
        for (int i=1;i<=5;i++){
        //     for(int j=0;j<4-i;j++){
        // System.out.print(" ");
        // }
            // if (i%2==0){

            for(int j=1;j<=i;j++){
                // j=j+1;
                int sum=i+j;
                if(sum%2==0){
                System.out.print(1+" ");
                }
               else{
                System.out.print(0+" ");
               }
            }
        System.out.println();
        
    }
    }
}
