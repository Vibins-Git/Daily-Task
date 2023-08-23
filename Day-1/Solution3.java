//Program for Reversing a number

import java.util.*;
public class Solution3
{
    //Reversing a number
    public static void main(String[] args)
    {
        int reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
        int number = sc.nextInt();
        while(number!=0)
        {
            int remainder =number%10;
            reverse = reverse*10 + remainder;
            number =number/10;
        }
        System.out.println("The reverse of  given number is " + reverse);

    }
}
