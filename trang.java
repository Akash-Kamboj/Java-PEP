import java.util.*;

public class trang 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a: ");
        a = s.nextInt();

        System.out.println("Enter the value of b: ");
        b = s.nextInt();

        System.out.println("Enter the value of c: ");
        c = s.nextInt();
        
        if(c*c==(a*a+b*b))
        {
            System.out.println("The given sides form a right angled triangle.");
        }
        else{
            System.out.println("The given sides do not form a right angled triangle.");
        }

    }

    
}
