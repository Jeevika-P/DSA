import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        String lastName = in.nextLine();
       
        int n = in.nextInt();
        
        String fullName = firstName + lastName;
        for(int i=1;i<=n;i++)
        {
            System.out.println(fullName);
        }
    }    
}