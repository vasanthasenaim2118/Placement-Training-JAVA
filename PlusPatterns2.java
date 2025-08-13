import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r,c,n;
        n=sc.nextInt();
        int mid=(n/2)+1;
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==mid||c==mid){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
