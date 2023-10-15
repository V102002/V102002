import java.lang.reflect.Array;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target=51;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix,int target){
        int lowerB=0;
        int upperB=matrix.length-1;
        while (lowerB<matrix.length&& upperB>= 0) {
            if (matrix[lowerB][upperB]>target) {
                upperB--;
            }else if (matrix[lowerB][upperB]<target) {
                lowerB++;
            }else{
                return new int[]{lowerB,upperB};
            }
        }
        return new int[]{-1,-1};
    }
}
