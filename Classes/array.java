// find maximum consecutive one in an array
import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The array is:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("The maximum consecutive 1 is: " + max);
        System.out.println("The maximum consecutive 0 is: " + min);

        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == 1)
            {
                count++;
                if(count > max)
                {
                    max = count;
                }
            }
            else
            {
                count = 0;
            }
        }


    }
    
}
