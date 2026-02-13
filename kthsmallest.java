import java.util.*;
class kthsmallest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {7, 10, 4, 3, 20, 15};
        int n = arr.length;

        System.out.print("enter k : ");
        int k = sc.nextInt();

        for(int i=0; i<k; i++)
        {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for(int j=i; j<n-1; j++)
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
        System.out.println(arr[k-1]);
    }
}