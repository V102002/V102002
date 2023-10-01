public class SearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        
    }
    //We can try finding the pivot using the same 4 cases but it'll will fail, as start=end=mid
    //what can be the cases here
    static int FindingPivot(int[] arr){
        //basic binary Search but extra stuff
            int start=0;
            int end=arr.length-1;
            while (start<=end) {
                int mid=start+(end-start)/2;
                //4 cases
                if (mid<end && arr[mid]>arr[mid+1]) {//the middle element is in array and middle element is greater than its' adjacent
                    return mid;
                }
                 if (mid>start && arr[mid]<arr[mid-1]) {
                    /*middle element is not in index -1 and less than its lower index element*/
                    return mid-1;
                }
                if (arr[mid]==arr[start] && arr[mid]==arr[end]) {
                    //skip the duplicate values
                    //BUT BEFORE SKIPPING, WE HAVE TO SEE IF EITHER START OR END ARE PIVOTS
                
                //THESE CHECKS ARE BASICALLY CASE 1 AND CASE 2
                    
                    if (arr[start]>arr[start+1]) {
                        //start is pivot when it's next element is less than start element
                        return start;  
                    }
                    start++;
                    if (arr[end]<arr[end-1]) {
                        //end is pivot when it's previous element is less than end element
                        return end-1;
                    }
                    end--;  
                }
                //if the left side is sorted, so the pivot will be in the right side
                else if (arr[start]<arr[mid] || arr[start]==arr[mid]&&arr[end]<arr[mid]) {
                    /*if the start element is less than mid we know that the left side is sorted
                       and if the start or mid element are equal AND  the end is less than mid elemntn, pivot will be on the right side
                     */
                    start=mid+1;//since the pivot will be on right
                }else{
                    end=mid-1;//pivot will be on left side
                }
            }
            return -1;
    }
}
