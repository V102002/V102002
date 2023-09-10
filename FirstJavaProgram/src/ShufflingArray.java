public class ShufflingArray {
    public static int[] shuffle(int[] nums, int n) {
        n=nums.length/2;
        int[] result=new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
    public static void main(String[] args) {
        ShufflingArray shufflingArray=new ShufflingArray();
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] result = shufflingArray.shuffle(nums, 6);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }   
}
