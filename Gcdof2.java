
package gcdof2;

import java.util.*;
public class Gcdof2 {
    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
         return m;
        
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the two numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
        
        System.out.println("the gcd is" +gcd(a,b));

    }
    
}
