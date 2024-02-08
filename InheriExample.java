
package inheriexample;

class car
{
    public void start()
    {
        System.out.println("car..start");
    }
     public void accelerate()
    {
        System.out.println("car.is accelerate");
    }
      public void changegear()
    {
        System.out.println("car.geAR change");
    }
}

class Luxarycar extends car
{
       @Override
       public void changegear()
    {
        System.out.println("automatic gear");
    }
       
          public void openroof()
    {
        System.out.println("car.open roof");
    }
}


public class InheriExample {

    
    public static void main(String[] args) {
        
        car c = new Luxarycar();
        c.start();
        c.accelerate();
        c.changegear();
      //  c.openroof();
        
    }
    
}
