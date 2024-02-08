
package dynamicdispatchex;

class superEx
{
    public void meth1()
    {
        System.out.println("super method1");
    }
     public void meth2()
    {
        System.out.println("super method2");
    }
}

class subEx extends superEx
{
    @Override
    public void meth2()
    {
        System.out.println("sub method 2");
    }
     public void meth3()
    {
        System.out.println("sub method3");
    }
}
       

        
    



public class DynamicdispatchEX {

    public static void main(String[] args) {
        
        superEx su=new subEx();
        
        su.meth1();
        su.meth2();
        
    }
    
}
