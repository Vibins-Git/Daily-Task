//Program for printing fibonacciSeries.

import java.util.*;
public class Solution2
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the any number : ");
            int input=sc.nextInt();
            int firstNum=0,secondNum=1;
            System.out.print(firstNum + " " + secondNum + " ");
            while(true)
            {
                int result= firstNum + secondNum;
                if(result>=input)
                    {
                        break;
                    }
                firstNum = secondNum;
                secondNum = result;
                System.out.print(result + " ");
            }
    }
}