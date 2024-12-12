import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = n;
        int rev = 0;
        while(n>0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        if(rev == x){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}