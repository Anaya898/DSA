public class complex {
    
    public static void main(String[] args) {
        int n=7;

     for(int i=0;i<n;i++){   
        for(int j=0;j<i;j++){            
            System.out.print("*");
            }

        int k=2 * (n-i);
        for(int j=1;j<=k;j++){
                System.out.print(" ");
            }
        
        // for(int j=0;j<i;j++){            
        //         System.out.print(" ");
        //         }
                
        System.out.println();
    }

    // reverse
    for(int i=n;i>0;i--){   
        for(int j=0;j<i;j++){            
            System.out.print(" ");
            }

        int k=2 * (n-i);
        for(int j=1;j<=k;j++){
                System.out.print(" ");
            }
        
        for(int j=0;j<i;j++){            
                System.out.print("*");
                }
                
        System.out.println();
    }   
    }
}

