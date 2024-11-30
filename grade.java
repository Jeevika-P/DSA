import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark =  in.nextInt();
        if(mark>=90){
            System.out.print("Grade A");
        }
        else if(mark>=80 && mark<90){
            System.out.print("Grade B");
        }
        else if(mark>=60 && mark<80){
            System.out.print("Grade C");
        }
        else if(mark>=35 && mark<60){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }
    }
}
