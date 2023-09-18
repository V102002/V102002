import java.util.ArrayList;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target=new ArrayList<Integer>(nums.length);
        int[] ans=new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            target.add(index[i],nums[i]);
        }
        for(int i=0;i<target.size();i++){
            ans[i]=target.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        createTargetArray(nums, index);
    }
}
