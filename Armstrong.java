
package armstrong;

import java.util.*;
public class Armstrong {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        
        int n=sc.nextInt();
        int m=n;
        int sum=0,r;
        
        while(n>0)      //when loop ends value of n beome zero thats why we need to store n value in m
        {
           r=n%10;
           sum=sum+r*r*r;
           n=n/10;
        }
        System.out.println(sum);
        
        if(m==sum)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not a armstrong number");
        }
    }
    
}
