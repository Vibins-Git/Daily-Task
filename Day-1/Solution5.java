// program to reverse a group of element in an array.

public class Solution5
{
    public static void reverse(int[] arr,int N, int k)
    {
        for(int i=0;i<N;i=i+k)
        {
            int left = i;
            int right = Math.min(i+k-1,N-1);
            while(left < right)
            {
                int temp = arr[right];
                arr[right] =arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3,4,5};
        int N = arr.length;
        int k=4;
        reverse(arr,N,k);
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}