public class FindingMaxElement {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(Max(arr));
    }
    static int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i]>max) {
            max=arr[i];
          }
        }
        return max;
    }
}
