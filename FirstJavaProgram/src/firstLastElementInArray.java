public class firstLastElementInArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=7;
        System.out.println(FirstLstElement(nums, target));
    }
    static int[] FirstLstElement(int[] arr,int target){
        
        int[] ans={-1,-1};
        int start=BinarySearch(arr,target,true);
        int end=BinarySearch(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int BinarySearch(int[] arr,int target,boolean Startindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target>arr[mid]) {
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1; 
            }else{//potential answer is found       
                ans=mid;//if the target is equal to mid, there might be a possibility of first occurence of target in left side
                if (Startindex) {//possibility that there might be first occurence on left side of target
                    end=mid-1;
                }else{
                    start=mid+1;//possibility that there might be last occurence on right side of target
                }
            }
        }
        return ans;
    }
}
