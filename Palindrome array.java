import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class findElement
{
    
    public static boolean isPalindrome(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i] == arr[n-i-1]){
                return true;
            }
        }return false;
    }
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		boolean result = isPalindrome(arr);
		System.out.print(result);
		
	

	}
}
