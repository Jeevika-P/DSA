import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size =  in.nextInt();
        switch(size){
            case 29:
                System.out.print("Small");
                break;
            case 30:
                 System.out.print("Medium");
                 break;
            case 38:
                System.out.print("Large");
                break;
            case 42:
                System.out.print("XLarge");
                break;
            default:
                System.out.print("Invalid");
            
        }
    }   
}