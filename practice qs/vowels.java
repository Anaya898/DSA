
public class vowels {
    public static void main(String[] args) {
        String str="daedfkgnu";
        int count=0;
        for (int i=0; i<str.length();i++){
            char a= str.charAt(i);
            if(a=='a' || a=='e'){
                count++;
            }
        }

        System.out.println(count);
    }

}
