/*You go to your relative's house with your parents and relatives to check your skills by giving a coding problem. You have to solve the given problem to show you are intelligent. They give you two integers A and B and ask to print prime numbers between A and B (inclusive).

Input Format
First line contains the T- number of test cases. Second line contains A and B.*/
import java.util.*;
public class HR_27_6_Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j<=b; j++)
            {
                int flag = 0;
                for(int k = 2; k<j; k++)
                {
                    if(j%k==0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println(j);
                }
            }
    
    }
     
}
}
