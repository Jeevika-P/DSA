import java.util.*;
import java.lang.*;
import java.io.*;

class demo
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=5;
	    int[] a = {1,2,3,4,5};
		
		int even = 0; // Initialize even counter
		int odd = 0;  // Initialize odd counter
		for (int i = 0; i < n; i++) {
		    if (a[i] % 2 == 0) { // Check if the number is even
		    even++;
		        
		    } else { // Otherwise, it's odd
		    odd++;
		        
		    }
		    
		}
		// Output the counts
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);


	}
}
