import java.util.*;
class selectiondescending
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {8, 4, 1, 9, -3, 6, 5};

        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;

            for(int j=i; j<n; j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        for(int ele : arr)
        {
            System.out.print(ele+",");
        }
    }
}