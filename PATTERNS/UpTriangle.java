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
        for(r=1;r<=n;r++){
            for(int space=1;space<=n-r;space++){
                System.out.print(" ");
            }
            for(c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
