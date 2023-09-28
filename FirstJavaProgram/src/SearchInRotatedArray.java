public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int pivot=FindingPivot(arr);
        if (BinarySearch(arr,0,pivot,target)!=-1) {
            System.out.println(BinarySearch(arr,0,pivot,target)!=-1);
        }else{
            System.out.println(BinarySearch(arr,pivot+1,arr.length-1,target));
        }
    }
    
    
    static int FindingPivot(int[] arr){
        //basic binary Search but extra stuff
            int start=0;
            int end=arr.length-1;
            while (start<=end) {
                int mid=start+(end-start)/2;
                //4 cases
                if (mid<end && arr[mid]>arr[mid+1]) {
                    return mid;
                }
                 if (arr[mid]<arr[mid-1]) {
                    return mid-1;
                }else if (arr[mid]<=arr[start]) {
                    end=mid-1;
                } else if(arr[start]<arr[mid]){
                    start=mid+1;
                }
            }
            return -1;
    }
    static int BinarySearch(int[] arr,int start,int end,int target){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }else if (arr[mid]>target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
}
