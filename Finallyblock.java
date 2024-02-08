
package finallyblock;


public class Finallyblock   {
    
    static void meth1()throws Exception
    {
        try
        {
        throw new  Exception();
        }
        finally
        {
            System.out.println("final msgs");
        }
    }

    
    public static void main(String[] args)  {
        
     
        try
        {
            meth1();
        }
        
        
        
        catch(Exception e)
         {
              System.out.println(e);
                
                       
         }
     
        
      /*  try
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("final msg");
        }*/
    }
    
}
