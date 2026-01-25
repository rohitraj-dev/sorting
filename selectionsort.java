import java.util.*;
class selectionsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {8, 4, 1, 9, -3, 6, 5};

        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            
            for(int j=i; j<n; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        for(int ele : arr)
        {
            System.out.print(ele+",");
        }
    }
}