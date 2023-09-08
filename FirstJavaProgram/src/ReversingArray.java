import java.util.Arrays;
public class ReversingArray {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

