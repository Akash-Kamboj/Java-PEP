import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();

        // int arr[] = new int[n];
        // int arr[] = {10,20,30,40,50};

        // System.out.println("Enter the elements of the array");
        // for(int i=0; i<n; i++)
        // {
        // System.out.print(i+" ");
        // }

        // System.out.println("Elements of array");

        // for(int x : arr)
        // {
        // System.out.print(x+" ");
        // }

        // --------------------------------------------------------------------------------------------------------------------------
        // Ques=> WAP to print a Matrix
        // int row;
        // int col;
        // System.out.println("Enter the number of rows");
        // row = sc.nextInt();

        // System.out.println("Enter the number of col");
        // col = sc.nextInt();

        // int arr[][] = new int[row][col];

        // for(int i=0; i<row; i++)
        // {
        // for(int j=0; j<col; j++)
        // {
        // System.out.print("Enter element at ["+i+"]["+j+"] ");
        // arr[i][j] = sc.nextInt();
        // }

        // System.out.println();

        // }

        // System.out.println("Matrix is ");
        // for(int i=0; i<row; i++)
        // {
        // for(int j=0; j<col; j++)
        // {
        // System.out.print(arr[i][j]+" ");

        // }
        // System.out.println();
        // }

        // ---------------------------------------------------------------------------------------------------------------------
        // Ques=> WAP to implement ternery operetor
        // int a;
        // int b;
        // int c;

        // System.out.println("Enter the value of a:");
        // a = sc.nextInt();

        // System.out.println("Enter the value of b:");
        // b = sc.nextInt();

        // // System.out.println("Enter the value of c:");
        // // c = sc.nextInt();

        // System.out.println(a<b? "true": "false");

        // ---------------------------------------------------------------------------------------------------------------------------

        // Ques => WAP to perform Addition on a Matrix
        // int row1;
        // int col1;
        // System.out.println("Enter the number of rows for 1st Matrix");
        // row1 = sc.nextInt();

        // System.out.println("Enter the number of col of 1st Matrix");
        // col1 = sc.nextInt();

        // int arr1[][] = new int[row1][col1];

        // for(int i=0; i<row1; i++)
        // {
        // for(int j=0; j<col1; j++)
        // {
        // System.out.print("Enter element at ["+i+"]["+j+"] ");
        // arr1[i][j] = sc.nextInt();
        // }

        // System.out.println();

        // }

        // System.out.println("1st Matrix is ");
        // for(int i=0; i<row1; i++)
        // {
        // for(int j=0; j<col1; j++)
        // {
        // System.out.print(arr1[i][j]+" ");

        // }
        // System.out.println();
        // }

        // int row2;
        // int col2;
        // System.out.println("Enter the number of rows for 2nd Matrix");
        // row2 = sc.nextInt();

        // System.out.println("Enter the number of col of 2nd Matrix");
        // col2 = sc.nextInt();

        // int arr2[][] = new int[row2][col2];

        // for(int i=0; i<row2; i++)
        // {
        // for(int j=0; j<col2; j++)
        // {
        // System.out.print("Enter element at ["+i+"]["+j+"] ");
        // arr2[i][j] = sc.nextInt();
        // }

        // System.out.println();

        // }

        // System.out.println("2nd Matrix is ");
        // for(int i=0; i<row2; i++)
        // {
        // for(int j=0; j<col2; j++)
        // {
        // System.out.print(arr2[i][j]+" ");

        // }
        // System.out.println();
        // }

        // ----------------------------------------------------------------------------------------------------------
        // Ques => WAP to find maximum number in array

        // Scanner sc = new Scanner(System.in);
        // int n;

        // int arr [] = {10,20,30,40};
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++)
        // {
        // if (arr[i] > max)
        // {
        // max = arr[i];
        // }
        // }
        // System.out.println("Maximum number in array is " + max);

        // ------------------------------------------------------------------------------------------------------------------

        // Ques => WAP to implemet the transpose an array
        // int row;
        // int col;
        // System.out.println("Enter the number of rows");
        // row = sc.nextInt();

        // System.out.println("Enter the number of col");
        // col = sc.nextInt();

        // int arr[][] = new int[row][col];

        // for (int i = 0; i < row; i++)
        // {
        // for (int j = 0; j < col; j++)
        // {
        // System.out.print("Enter element at [" + i + "][" + j + "] ");
        // arr[i][j] = sc.nextInt();
        // }

        // System.out.println();

        // }

        // System.out.println("Matrix is ");
        // for (int i = 0; i < row; i++)
        // {
        // for (int j = 0; j < col; j++)
        // {
        // System.out.print(arr[i][j] + " ");

        // }
        // System.out.println();
        // }

        // System.out.println("Transpose of Matrix is ");
        // for (int i = 0; i < col; i++)
        // {
        // for (int j = 0; j < row; j++)
        // {
        // System.out.print(arr[j][i] + " ");

        // }
        // System.out.println();
        // }

        // ---------------------------------------------------------------------------------------------------------------------

        /*
          Ques=> There are n kids with candies. You are given an integer array candies,where each candies[i] represents
          the number of candies the ith kid has, and an integer extraCandies, denotingthe number of extra candies that you have.
          Return a boolean array result of length n, where result[i] is true if, aftergiving the ith kid all the extraCandies,
          they will have the greatest number of candies among all the kids, or false otherwise.
          Note that multiple kids can have the greatest number of candies.
         */

        // System.out.println("Enter the size of Array");
        // int n = sc.nextInt();

        // int candies[] = new int[n];
        // System.out.println("Enter the elements of the array");
        // for(int i=0; i<n; i++)
        // {
        // candies[i] = sc.nextInt();
        // }

        // System.out.println("Elements of array");

        // for (int i = 0; i < n; i++) {
        //     System.out.print(candies[i]+" ");
        // }

        // System.out.println();

        // System.out.println("Enter the extra candies");
        // int extraCandies = sc.nextInt();
        
        // int maxCandies = Arrays.stream(candies).max().getAsInt();
        // boolean result[] = new boolean[n];
        // for(int i=0; i<n; i++)
        // {
        //     result[i] = candies[i] + extraCandies >= maxCandies;
        // }

        // for (int i = 0; i < n; i++) {
        //     if (result[i]) {
        //         System.out.print("true ");
        //     } else {
        //         System.out.print("false ");
        //     }
        // }

        //-------------------------------------------------------------------------------------------------------
        /* Ques=> Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the 
            non-zero elements.
            Note that you must do this in-place without making a copy of the array.
        */

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the Elements in Array:");
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println("Elements of Array");
        for (int i = 0; i < n; i++)
        {
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        
        int j = 0;
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] != 0)
            {
                nums[j++] = nums[i];
                
            }
        }

        while (j < n) {
            nums[j++] = 0;
        }

        System.out.print("After moving zeros to the end: ");
        for (int i = 0; i < n; i++) 
        {
         System.out.print(nums[i] + " ");
        }
        System.out.println();

        
    
    }
}