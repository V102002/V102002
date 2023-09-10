import java.util.Scanner;
import java.util.Arrays;


public class ConcatenatingArrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nums[]=new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        int numLength=nums.length;
        int[] result=new int[numLength+numLength];
        System.arraycopy(nums, 0, result, 0, numLength);
        System.arraycopy(nums, 0, result, numLength, numLength);
        System.out.println(Arrays.toString(result));
        in.close();
    }
}
