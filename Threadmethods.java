
package threadmethods;



class Mythread extends Thread
{
    public void run()
    {
        int cnt=1;
        while(true)
        {
           System.out.println(cnt++  +"My thred"); 
        }
    }
}

public class Threadmethods {

    
    public static void main(String[] args) {
        
        Mythread m=new Mythread();
         m.start();
         
        int cnt=1;
        while(true)
        {
           System.out.println(cnt++  +"Main"); 
           Thread.yield(); //it will give More cpu time to My thread and it prints more
        }
        
      //  m.setDaemon(true); //after calling daemon method loop wil terminated as the main method ends so it prints nothing bt loop had executed
    
       // try{Thread.sleep(100);}catch(Exception e){}   it writes cause u hav to know that loop executed bt it terminates after main method ends  
       
      // Thread bt=Thread.currentThread();  //reference of curent thread
    //    try {
      //      bt.join(); //main method waitig for completing the other methods
    //    } catch (InterruptedException ex) {
      //      Logger.getLogger(Threadmethods.class.getName()).log(Level.SEVERE, null, ex);
      //  }
    }
    
    
}
