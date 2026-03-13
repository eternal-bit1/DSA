

public class searchin2dMatrix {
    
    boolean findin(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid =(start+end)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]==target)
            {
                return true;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }

    
    public boolean searchMatrix(int[][] matrix, int target) {
       int start=0;
       int end =matrix.length-1;
       while(start<=end)
       {
        int mid=(start+end)/2;
        if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target)
        {
        return findin(matrix[mid],target);
        }
        else if(matrix[mid][0]<target)
        {
            start=mid+1;
        }
        else
        {
            end =mid-1;
        }
       } 
       return false;
    }   
}


