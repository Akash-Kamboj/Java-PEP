// {
//     public void Sqr(int num)
//     {
//         int result = num*num;
//         System.out.println("Result is "+result );
//     }
// }
// class SQR 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         calc_sqr obj = new calc_sqr();
//         obj.Sqr(num);
//     }
    
// }

// --------------------------------------------------------------------------------------------------------------------------

/* Ques => Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements 
of nums except nums[i].The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.*/

class SQR
{
    public static void main(String[] args) 
    {
        int num [] = {1, 2 ,3, 4};
        int n = num.length;
        int[] result = new int[n];
        result[0] = 1;
        
        for(int i = 1; i < n; i++)
        {
                
            if(i<0)
            {
                result[i] = 1;
            }

            else
            {
                result[i] = result[i-1]*num[i-1];

            }
        }
                        

                                                                                                                                                       
    }
}
