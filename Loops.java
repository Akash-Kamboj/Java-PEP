import java.util.*;
public class Loops 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number: ");
        // n = sc.nextInt();

        // for(int i = 1; i<=n; i++)
        // {
           
        //     System.out.print(" "+i);
        // }
 // -----------------------------------------------------------------------------------------------------------------
//  Ques table 
        // for(int i = 1; i<=10; i++)
        // {
        //     System.out.println(n+" * "+i+" = "+n*i);
        // }

// --------------------------------------------------------------------------------------------------------------
        //  Ques =>For multiples of three, print "Fizz" instead of the number,and for the multiples of five, print "Buzz".

        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number: ");
        // n = sc.nextInt();
        // for(int i = 1; i<=n; i++)
        // {
        //      if (i%3==0&&i%5==0)
        //     {
        //         System.out.print("FizzBuzz");
        //     }

        //     else if(i%3==0)
        //     {
        //         System.out.println("Fizz");
        //     }

        //     else if(i%5==0)
        //     {
        //         System.out.println("Buzz");
        //     }

        //     else
        //     {
        //         System.out.println("Out of range ");
        //     }
            
        // }

//-------------------------------------------------------------------------------------------------------------- 

        // Ques => sum of the digits
        // Scanner sc = new Scanner(System.in);
        // int n;

        // System.out.println("Enter the digits: ");
        // n = sc.nextInt();
        // int sum = 0;

        // while(n!=0)
        // {
        //     sum = sum + n%10;
        //     n = n/10;
        // }
        // System.out.println("Sum of the digits: "+sum);
       
//------------------------------------------------------------------------------------------------------------ 
     
    //    Ques => check the number is prime number 
        //   Scanner sc = new Scanner(System.in);
        //   int n;
        //   System.out.println("Enter the number: ");
        //   n = sc.nextInt();

        //   for(int i = 2; i<Math.sqrt(n); i++)
        //   {
        //     if(n%i==0)
        //     {
        //         System.out.println("Not a prime number");
        //     }

        //     else 
        //     {
        //         System.out.println("Prime number");
        //     }
        //   }

 //------------------------------------------------------------------------------------------------------------------

       //  Ques => find the number is  perfect number 
        //  Scanner sc = new Scanner(System.in);
        //  int n;

        //  System.out.println("Enter the number: ");
        //  n = sc.nextInt();
       
        //  int sum = 0;

        //  for(int i = 1; i<n; i++ )
        //  {
        //   if((n%i)==0)
        //  {
        //         sum = sum + i;
        //  }
        // }

        //  if(sum == n)
        // {
        //   System.out.println(n+" is Perfect Number ");
        // }

        //  else 
        // {
        //   System.out.println(n+" is Not a Perfect Number");
        // }
        
// ------------------------------------------------------------------------------------------------------------------------

   //Ques=> WAP for Reverse the  number
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number: ");
        // n = sc.nextInt();
        // int rev = 0;
        // while (n!=0)
        // {
        //         int digit = n%10;
        //         rev = rev*10 + digit;
        //         n = n/10;
        // }
        // System.out.println("Reverse of the number is: "+rev);

// -------------------------------------------------------------------------------------------------------------------------

// Ques=> WAP to implement the Palindrome concept in java 
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number: ");
        // n = sc.nextInt();
        // int sum = 0;

        // while (n>0)
        // {
        //       int r=n%10;
        //       sum = (sum*10)+r;    
        //       n = n/10;    
               
        // }
        // if (sum==temp)
        // {

        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number ");
        // int n;
        // n = sc.nextInt();
        // System.out.println("Number is "+n);

// ---------------------------------------------------------------------------------------------------------

// Ques => WAP to find Greatest Common Devisor of two numbers 

        // Scanner sc = new Scanner(System.in);
        // int a; 
        // int b; 

        // System.out.println("Enter the value of a ");
        // a = sc.nextInt();
        // System.out.println("Enter the value of b ");
        // b = sc.nextInt();

        // int gcd = 0;
        // for(int i = 1; i <= a && i <= b; i++)
        // {
        //         if(a%i == 0 && b%i == 0)
        //         {
        //                 gcd = i;
        //         }
        // } 
        // System.out.println("GCD of "+a+ " and "+ b+ " is "+gcd);


// -------------------------------------------------------------------------------------------------------------

        // Ques => WAP to print a fabonacci series

        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the numbers ");
        // n = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // int c = 0;

        // System.out.print(a + " " + b + " ");
        // for (int i = 2; i < n; i++)
        // {
        //    c = a+b;
        //    System.out.print(c + " ");
        //    a = b;
        //    b = c;

        // }

 //----------------------------------------------------------------------------------------------------------------- 

        // Ques => WAP to print a factorial of a number
           
        // Scanner sc = new Scanner(System.in);
        // int n;

        // System.out.println("Enter the number ");
        // n = sc.nextInt();

        // int fact = 1;

        // for(int i = 1; i<=n; i++)
        // {
                
        //         fact= fact*i;
        //         System.out.println(fact);
        // }

//------------------------------------------------------------------------------------------------------------------
        //Ques => WAP to print revers pattren
        // Scanner sc = new Scanner(System.in);
        
        // int n;
        // System.out.println("Enter the number ");
        // n = sc.nextInt();

        // for(int i = 0; i < 5; i++ )
        // {
        //         for(int j = 0; j < 5-i; j++)
        //         {
        //                 System.out.print(" * ");
        //         }
        //         System.out.println();
        // }

//------------------------------------------------------------------------------------------------------------------------
        //Ques => WAP to print pyramid pattren
        // Scanner sc = new Scanner("System.in");
        // int n;
        // System.out.println("Enter the number ");
        // n = sc.nextInt();

//         System.out.println("Number is "+n);
//        for(int i = 0; i < n; i++ )
//        {
//         for(int j = 0; j < n-i; j++)
//         {
//                 System.out.print(" * ");
//         }
        
//                 System.out.println();
//         }  
        // for (int i = 0; i < n; i++)
        // {
        //         for (int j = n - i; j > 1; j--) 
        //         {
        //                 System.out.print(" ");
        //         }
        //         for (int j = 0; j <= i; j++)
        //         {
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }



      

        
        
        


//--------------------------------------------------------------------------------------------------------------------------
// Ques WAP to implement Star(*) pattren
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println("Enter the number ");
        // n = sc.nextInt();

        // for(int i = 1; i<=n; i++)
        // {
        //         for(int j = 1; j <= n-i; j++)
        //         {
        //                 if(j <= i)
        //                 {
        //                         System.out.print("*");
        //                 }
                        
        //         }
        //         System.out.println();
               
        // }

//------------------------------------------------------------------------------------------------------------------


               
                        

    }
}        

