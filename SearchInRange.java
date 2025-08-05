// Q)  arr={18,12,-7,3,14,28}   for this array search 3 in the range of index(1,4)

class SearchInRange
{
    public static void main(String[]args)
    {
        int [] arr={18,12,-7,3,14,28};
        int target=28;
        int start=1;
        int end=4;
        boolean res=searchElement(arr,target,start,end);
        if(res)
        {
            System.out.println(target+" : is present in given array");
        }
        else
        {
            System.out.println(target+" : is not present in array from "+start+" to "+end);
        }
    }

    public static boolean searchElement(int[]arr,int target, int startindx, int endindx) 
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int start=startindx;start<endindx;start++)
        {
            if(arr[start]==target)
            {
                return true;
            }

        }
        return false;
       
        
    }

}