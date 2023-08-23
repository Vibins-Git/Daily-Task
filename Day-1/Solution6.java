//program to print simple matrix

import java.util.*;
public class Solution6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int row =s.nextInt();
        System.out.println("Enter the number of column : ");
        int column = s.nextInt();
        System.out.println("Enter the matrix elements : ");
        int[][] matrix= new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix elements are ");
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
