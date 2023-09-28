public class FindInMountainArray {
    public static void main(String[] args) {
        
    }
    static int Search(int[]arr,int target){
        int peak=peakIndexInMountainArray(arr);//find the peak of the array
        int firstHalf=InfiniteArray(arr, target, 0, peak);
        if (firstHalf!=-1) {//if the element exists
            return firstHalf;
        }else{
            return InfiniteArray(arr, target, peak+1, arr.length-1);
        }
    }

    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length+1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }


    static int InfiniteArray(int[]arr,int target,int start, int end){//binary search in an array where we don't know the length
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
