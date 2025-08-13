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
            for(c=1;c<=n;c++){
                System.out.print(r%2);
            }
            System.out.println();
        }
    }
}
