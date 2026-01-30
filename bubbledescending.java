import java.util.*;
class bubbledescending
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3, 5, 1, 4, 2, 0};
        int temp = 0;
        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int ele : arr)
        {
            System.out.print(ele+",");
        }

    }
}