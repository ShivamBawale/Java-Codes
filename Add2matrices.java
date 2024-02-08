
package add2matrices;


public class Add2matrices {

    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{4,5,6},{2,8,9},{1,11,12}};
        int C[][]=new int [3][3];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int X[]:C)
        {
            for(int Y:X)
            {
                System.out.print(Y+" ");
            }
            System.out.println("");
        }
    }
    
}
