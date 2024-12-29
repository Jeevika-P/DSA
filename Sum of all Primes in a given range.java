import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


class demo{
    public static int sumOfPrime(int L,int R){
        
        int[] a = new int[R+1];
        for(int i=2;i<=R;i++){
            a[i]=1;
        }
        for(int i=2;i<=Math.sqrt(R);i++){
            if(a[i]==1){
                for(int j=2*i;j<=R;j=j+i){
                    a[j]=0;
                }
            }
        }
        int sum=0;
        for(int i=Math.max(L,2);i<=R;i++){
            if(a[i]==1){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter L :");
        int L = in.nextInt();
        System.out.println("Enter R :");
        int R = in.nextInt();
        int result = sumOfPrime(L,R);
        System.out.print("Sum : "+result);
    }
}