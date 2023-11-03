import java.util.Scanner;
import java.lang.Math;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int k=0;
        System.out.println("Enter max number of zeroes: ");
        Scanner inp=new Scanner(System.in);
        int[] arr={1,1,1,0,0,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0};
        System.out.println(longestOnes(arr, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int left=0;//pointer at the start of the array
        int zeroCount=0;//zero counter
        int MaxOnes=0;//Maximum number of ones
        
        //using a for loop to get the max consecutive ones through out the array
        for (int right = 0; right < nums.length; right++) {
            if(nums[right]==0){
                zeroCount++;
            }
            while (zeroCount>k) {
                if (nums[left]==0) {//'removing' the zeroes from the array
                    zeroCount--;
                }
                left++;
            }
            MaxOnes=Math.max(MaxOnes,right-left+1);
        }
        return MaxOnes;
    }
    
}
