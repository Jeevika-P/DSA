import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        while(n>0){
            int ld = n%10;
            count=count+1;
            n = n/10;
        }
        System.out.println(count);
    }
}
