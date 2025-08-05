//Q) write code to find max num in 2D Array

import java.util.Arrays;

class MaxIn2D
{
    public static void main(String[]args)
    {
        int [][]arr={{18,92,80,56},{88,34,12},{76,98,653,98,12}};
        
        int  res=maxIn2D(arr);
        System.out.println(res);
    }

   public static int maxIn2D(int[][] arr) {
      int max=arr[0][0];
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
            if(max<arr[i][j])
            {
                max=arr[i][j];
            }
        }
      }
      return max;


    }
}