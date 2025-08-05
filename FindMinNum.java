//Q) find mininum num from given array
class FindMinNum
{
    public static void main(String[]args)
    {
    int arr[]={18,12,-7,3,14,28};
    int min= minimumNum(arr);
    System.out.println(min);
    }

    public static int minimumNum(int []arr)
     {
        if(arr.length==0)
        {
            return -1;
        }

        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
        {
            min=arr[i];
        }
        }    
        return min;    
        
    }

}