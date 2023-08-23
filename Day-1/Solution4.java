/*Program to Coping one array elements to another array */

public class Solution4
{
    public static void main(String[] args)
    {
        int[] A = new int[] {1,2,3,4,5};
        int[] B = new int[A.length];
        System.out.println("Array elements of Orginal Elements : ");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        for(int i=0;i<A.length;i++)
        {
            B[i] = A[i];
        }
        System.out.println();
        System.out.println("Array elements of Copied Elements : ");
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i] + " ");
        }

    }
}
