
package firstlambda;

interface Mylambda
{
    public void diplay();
}

 class Firstlambda {

    
    public static void main(String[] args) {
        
        Mylambda m= () ->{System.out.println("hello sivam");};
        m.diplay();
    }
    
}
