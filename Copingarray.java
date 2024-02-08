
package copingarray;


public class Copingarray {

   
    public static void main(String[] args) {
        int arr1[]={8,6,10,9,2,15,7,13,14,11};
        int arr2[]=new int[10];
    
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.print("original elements of array");
        
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"");
        }
        System.out.print("");
        
        System.out.println("Elements of new array");
        
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+"");
        }
    }
    
}
