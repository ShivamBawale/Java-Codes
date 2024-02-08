
package factorialofn;

import java.util.*;
public class Factorialofn {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the number");
       int n=sc.nextInt();
       
        int  facto=1;
       
       for(int i=1;i<=n;i++)
       {
           facto=facto*i;
       }
       System.out.println("Factorial is "+facto);
    }
    
}
