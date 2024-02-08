
package fibonaciseries;

import java.util.*;
public class Fibonaciseries {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int a=0,b=1,c;
        
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++)//already printed the first two terms thats why -2
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
    
}
