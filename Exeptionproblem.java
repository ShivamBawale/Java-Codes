
package exeptionproblem;

class OverFlowException  extends Exception
{
    
    public String ToString()
    {
        return "Stack is full";
    }
}

class UnderFlowException extends Exception{
    
    public String ToString()
    {
        return "Stack im empty";
    }
} 


class Stack{
    private int size;
    private int top=-1;
    private int s[];
    
    public Stack(int sz)
    {
        size=sz;
        s=new int[sz]; 
    }
    public void push(int x) throws OverFlowException 
    {
        
        if(top==size-1)
            throw new OverFlowException();
        top++;
        s[top]=x;
    }
    
    public int pop() throws UnderFlowException
    {
        int x=-1;
        
        if(top==-1)
               throw new UnderFlowException();
        x=s[top];
        top--;
        return x;
     }
}
public class Exeptionproblem {

    public static void main(String[] args) {
        
        Stack st=new  Stack(5);
        try
        {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(70);
            st.push(60);
            st.push(90);
        }
        catch(OverFlowException s)
        {
            System.out.println(s);
        }
        
        
    }
    
}
