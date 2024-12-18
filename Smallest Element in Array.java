import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = in.nextInt();
		}
		int small=a[0];
		for(int i=0;i<n;i++){
		    if(small > a[i]){
		        small = a[i];
		    }
		}
		System.out.print(small);
	

	}
}
