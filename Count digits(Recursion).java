import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class demo
{
    public static int count(int n){
        if(n==0){
            return 0;
        }else{
            return 1+count(n/10);
        }
    }
    public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.println("Count of digits in a number is:"+count(n));
    }
}    

