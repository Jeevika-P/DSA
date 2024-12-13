import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        while(n>0)
        {
            int ld = n%10;
            n = n/10;
            if(n==0)
            {
                System.out.println(ld);
                
            }
        
        }  
    }
}
