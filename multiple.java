import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=1;x*i<=1000;i++){
            System.out.println(x*i);
        }
       
    }    
}