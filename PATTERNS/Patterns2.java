import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r,n,c;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            for(c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(r=n;r>=1;r--){
            for(c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
