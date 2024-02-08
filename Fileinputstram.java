
package fileinputstram;
import java.io.*;


public class Fileinputstram {

  
    public static void main(String[] args) {
        try
        {
        FileOutputStream fos=new  FileOutputStream("C:/Myjava/Test.txt");
        
        String str="learn java programming";
        fos.write(str.getBytes());
        
        fos.close();
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
    
    
}
