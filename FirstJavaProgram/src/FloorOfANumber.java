public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=binarySearch(arr,4 );
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //keep comparing as long as start is less than end
        while (start<=end) {
            //int mid=(start+end)/2;
            //there is a problem, there might be a possibility of start and end value to exceed the range of integer in java
            //so try
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{//if target=arr[mid]
                    return mid;
            }
        }
        return end;
    }
}
