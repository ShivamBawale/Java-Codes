
package wrapperex;


public class Wrapperex {

   
    public static void main(String[] args) {
       int m=12;
       Integer m1=m;
       Integer m3=Integer.valueOf("123");
       Integer m4=Integer.valueOf("1011",2); //it is inbinary form 
       Integer m5=Integer.max(23, 43);
        
       
       System.out.println(    m1.equals(m));
       System.out.println(m4);
       System.out.println(m5);
       
         System.out.println(Integer.parseInt("123"));
         System.out.println(Integer.divideUnsigned(12, 3));
         System.out.println(Integer.rotateLeft(1234, 2));
         System.out.println(Integer.remainderUnsigned(13, 3));
         System.out.println(Integer.bitCount(12));
         System.out.println(Integer.compare(123, 123));
    }
    
}
