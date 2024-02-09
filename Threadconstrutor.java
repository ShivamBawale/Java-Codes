
package threadconstrutor;

class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name); //for calling a super class constructor
        
    }
    
    public void run()
    {
        int cnt=1;
        while(true)
        {
            System.out.println(cnt++);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class Threadconstrutor {

    
    public static void main(String[] args) {
        
        Mythread y=new Mythread("My thread 1");
        y.start();
        y.interrupt();
       
     /*   System.out.println("Id"+y.getId());
        System.out.println("NAme"+y.getName());
        System.out.println("priority"+y.getPriority());
        y.start();
        System.out.println("state"+y.getState());
        System.out.println("Alive"+y.isAlive()); */
        
    }
    
}
