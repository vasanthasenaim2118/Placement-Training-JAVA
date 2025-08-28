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
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==1 || c==1 || r==n || c==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
