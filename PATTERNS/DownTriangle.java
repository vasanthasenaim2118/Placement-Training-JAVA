import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n,r,c;
        n=sc.nextInt();
        int n1=2*n-1;
        
        for(r=0;r<n1;r++){
            for(int space=0;space<r;space++){
                System.out.print(" ");
            }
            for(c=0;c<n1-2*r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
