import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int r,c,n,val;
        n=sc.nextInt();
        for(r=1;r<=n;r++){
            if(r%2==0){
                val=2;
            }else{
                val=1;
            }
            for(c=1;c<=r;c++){
                System.out.print(val);
                val=val+2;
            }
            System.out.println();
        }
    }
}
