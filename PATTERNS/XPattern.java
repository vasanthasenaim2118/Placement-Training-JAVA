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
        for(r=1;r<=n1;r++){
            for(c=1;c<=n1;c++){
                if(r==c||r+c==n1+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
