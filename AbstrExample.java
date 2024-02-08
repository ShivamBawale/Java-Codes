
package abstrexample;

 abstract class shivam
 {
    public shivam()
    {
        System.out.println("super constructor");
    }
    
    public void meth1()
    {
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
    
    
}

class bawale extends shivam
{
    @Override
    public void meth2()
    {
        System.out.println("meth2 sub");
    }
}



public class AbstrExample {

    
    public static void main(String[] args) {
        
        shivam s = new bawale();
        s.meth1();
        s.meth2();
        
    }
    
}
