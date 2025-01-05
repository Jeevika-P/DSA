import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class demo
{
    public static void divisors(int n,int i){
        if(i>n){
            return ;
        }
        if(n%i==0){
            System.out.print(i +" ");
        }
        divisors(n,i+1);
    }
    public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.println("Divisors are:");
	    divisors(n,1);
    }
}    
