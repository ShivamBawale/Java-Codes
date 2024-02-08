
package genericdemo2;


/*class data<T>
{
    private T obj;   //obj of type T
    public void setdata(T v)
    {
        obj=v;
    }
    public T getdata()
    {
        return obj;
    }
}*/

@SuppressWarnings("unchecked")
class myarray<T>
{
    T A[]=(T[]) new Object[10];
    int length=0;
    
    public void append(T v)
    {
        A[length++]=v;
    }
    
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class Genericdemo2 {

  
    public static void main(String[] args) {
        
   /*     data<Integer> d=new data<>();
        d.setdata(new Integer(3));
        
    
        System.out.println(d.getdata());*/
   
   myarray<Integer> ma=new myarray<>();
   ma.append(10);
   ma.append(34);
   ma.append(35);
   ma.display();
    }
    
    
}
