public class LArgestSUmSplitArray {
    public static void main(String[] args) {
        
    }
    static int SplitArray(int[]arr,int m){
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);//find the max element in the array
            end=end+arr[i];
        }
        //We have the start, end. Now we have  the binary search
        while (start<end) {
            int mid=start+(end-start)/2;
            
            //calculate the number of subarrays you can divide this in with the max sum
            int sum=0;
            int pieces=1;
            for (int num : arr) {
                if (sum+num>mid) {
                    //can't add this in the subarray, make a new subarray
                    sum=num;
                    pieces++;//increment the number of sub arrays
                }else{
                    sum+=num;//otherwise continue adding
                }
            }
            if (pieces>m) {
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;//this will be when start= end
    }
}
