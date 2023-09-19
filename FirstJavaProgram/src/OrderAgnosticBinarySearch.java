public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int[] arr={99,80,75,22,11,10,5,2,-3};
        int target=22;
        int ans=oAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
    static int oAgnosticBinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        //check if array is in ascending or descending
        boolean isAscending=arr[start]<arr[end];
        //keep comparing as long as start is less than end
        while (start<=end) {
            //int mid=(start+end)/2;
            //there is a problem, there might be a possibility of start and end value to exceed the range of integer in java
            //so try
            int mid=start+(end-start)/2;

            if (arr[mid]==target) {
                return mid;
            }
            if (isAscending) {
                //ASCENDING ORDER
                if (target<arr[mid]) {
                    end=mid-1;
                }else  {
                    start=mid+1;
                }
            }else{
                //DESCENDING ORDER
                if (target>arr[mid]) {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }
}
