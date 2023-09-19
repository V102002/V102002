public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int ans=binarySearch(arr, 3);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //keep comparing as long as start is less than end
        while (start<end) {
            //int mid=(start+end)/2;
            //there is a problem, there might be a possibility of start and end value to exceed the range of integer in java
            //so try
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
