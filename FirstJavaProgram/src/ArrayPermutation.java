import java.util.Scanner;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
        int nums[]= new int[10000];
        int[] ans=new int[10000];
        System.out.print("Enter the number of array elements: ");
        number=in.nextInt();
        for (int i = 0; i < number; i++) {
            nums[i]=in.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.print(nums[i]+" ");
        }

        for (int i = 0; i < number; i++) {
            ans[i]=nums[nums[i]];
        }
        System.out.println(" ");
        for (int i = 0; i < number; i++) {
            System.out.print(ans[i]+" ");
        }



        in.close();
    }
}
