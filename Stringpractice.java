package stringpractice;


public class Stringpractice {

   
    public static void main(String[] args) {
       String str1="java program";//strimg literal
       
       String str2 = new String("JAVA");
       
       char c[]={'h','e','l','l','o'};
       String str3 = new String(c,1,2);//1 means the array starts from index one and take two latters
       
       System.out.println(str1); 
       System.out.println(str2);
       System.out.println(str3);
    }
    
}
