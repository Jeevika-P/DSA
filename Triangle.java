import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       int d = a+b+c;
       if(d==180){
           System.out.print("Triangle can be formed");
       }
       else{
            System.out.print("Triangle cannot be formed");
       }
    }
}