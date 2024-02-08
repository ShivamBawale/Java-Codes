
package forchall;
import java.util.*;
 
public class Forchall {

    
    public static void main(String[] args) {  //natural number program
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
          int sum=0;
        
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" number is "+sum);
      
    }
    
}
