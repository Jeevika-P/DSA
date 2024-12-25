import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		for(int i=0;i<n;i+=2){
		    System.out.print(arr[i] +" ");
		}

	}
}
