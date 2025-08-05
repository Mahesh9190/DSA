//Q) write a code to find an element in 2D Array.

import java.util.Arrays;

class SearchIn2DArray
{
    public static void main(String[]args)
    {
        int [][]arr={{18,92,80,56},{88,34,12},{76,98,653,98,12}};
        int target=100;
        int [] res=searchIn2D(arr,target);
        System.out.println(Arrays.toString(res));
    }

   public static int[] searchIn2D(int[][] arr, int target) {
      
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
            if(target==arr[i][j])
            {
                return new int[]{i,j};
            }
        }
      }
      return new int[]{-1,-1};


    }
}