public class pyramid_num {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // int k=0;
            for(int j=i;j>0;j--){
            System.out.print(j);
            // k++;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
