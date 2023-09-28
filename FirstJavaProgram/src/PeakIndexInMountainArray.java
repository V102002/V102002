public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,6,5,4,3,2,1};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {//we may be in the descending part of array
                end=mid;//checking if there is a bigger element on the left side
            }else {//may be in the ascending part of the array
                start=mid+1;
            }
        }
        return start;
    }
}
