import java.util.*;
class checksorted
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("enter number of elements : ");
        n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("enter "+n+" elements");
        for(int i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        int flag = 0;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("unsorted array");
        }
        else
        {
            System.out.println("sorted array");
        }
    }
}