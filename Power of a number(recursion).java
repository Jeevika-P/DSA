import java.util.*;
import java.lang.*;
import java.io.*;

class PowerOfN {
    static int func(int a, int b){
    if(b==0){
        return 1;
    }
    return a * func(a,b-1);
}
    public static void main(String[] args) {
        System.out.println(func(2,3));
    }
}
   