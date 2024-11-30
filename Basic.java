import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        int a = in.nextInt();
        in.nextLine(); 

        
        String b = in.nextLine();

       
        char c = in.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        in.close();
    }
}
