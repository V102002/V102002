public class BinarySearchForInfiniteArray {
    public static void main(String[] args) {
        //since we don't know the size of array, we'll start from index 0 to index 1(2 elements)
        int[]arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[]arr,int target){//as long as the target is greater than the end element, keep doubling the chunk
        int start=0;
        int end=1;
        while (target>arr[end]) {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return InfiniteArray(arr, target, start, end);
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
