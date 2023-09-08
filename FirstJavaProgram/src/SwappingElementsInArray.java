import java.util.Arrays;
public class SwappingElementsInArray {   
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        swap(arr,1,3);//swapping numbers in index 1 and 3
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
