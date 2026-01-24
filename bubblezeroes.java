import java.util.*;
class bubblezeroes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 0, -2, 3, 0, 4, 8, 0, 10, 12};

        int n = arr.length;

        //int temp;

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(arr[j] == 0)
                {
                    //temp = 0;
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                }
            }
        }
        for(int ele : arr)
        {
            System.out.print(ele+",");
        }
    }
}