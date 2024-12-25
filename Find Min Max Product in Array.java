import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class demo
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] arr1 = new int[a];
		for(int i=0;i<a;i++){
		    arr1[i] = in.nextInt();
		}
		int b = in.nextInt();
		int[] arr2 = new int[b];
		for(int i=0;i<b;i++){
		    arr2[i] = in.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a;i++){
		    if(arr1[i]>max){
		        max = arr1[i];
		    }
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<b;i++){
		    if(arr2[i]<min){
		        min = arr2[i];
		    }
		}
		System.out.print(max*min);
	    
	}
}
