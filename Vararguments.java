
package vararguments;

public class Vararguments {
   /* static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }*/
        
     static void showList(int start, String ...s)
     {
         for(int i=0;i<s.length;i++)
         {
             System.out.println(start+"."+s[i]);
             start++;
         }
     }
    

    
    public static void main(String[] args) {
       /* show();
        show(10);
        show(10,20,30);
        show(new int[]{3,4,5,6,7,8});//annonmous array*/
        showList(1,"smith","john","shiv","bharat");
}
    
}
