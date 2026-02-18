import java.util.*;
class twosum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        
        int arr[] = {7, 0, 4, 3, 2, 8, 10};

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;
        int target = 9;

        while(i<j)
        {
            if(arr[i] + arr[j] == target)
            {
                System.out.println("target found");
                break;
            }
            else if(arr[i] + arr[j] > target)
            {
                j--;
            }
            else if(arr[i] + arr[j] < target)
            {
                i++;
            }
            else
            {
                System.out.println("no pair found");
            }
        }
        for(int ele : arr)
        {
            System.out.print(ele+",");
        }
    }
}