import java.util.*;
class common
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = {3, 1, 2, 1, 1, 4, 5, 5};
        int b[] = {6, 1, 1, 4, 4, 2, 8};
        
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> c = new ArrayList<>();
        // int c[] = new int[50];
        int i = 0;
        int j = 0;
        //int k = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] == b[j])
            {
                c.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
        }
        for(int ele : c)
        {
            System.out.print(ele+" ");
        }
    }
}