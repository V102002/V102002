public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23,45,1,2,8,19,-3,16,-11,28};
        int target=19;
        int ans=linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if (arr.length==0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it = to target
            int element=arr[i];
            if (element==target) {
                return i;
            }
        }
        //if the above code doesn't return anything
        return -1;
    }
}
