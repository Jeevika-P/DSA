import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            sum = sum + i;
            
            if (n/i != i) {
                sum=sum + n / i;
            }    
            }
        }    
        if(sum==n && n!=1 ){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
        
    }
}
