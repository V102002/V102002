public class FlippingAnImage {
    public static void main(String[] args) {

    
    }
    static int[][] ReversingArray(int[][] arr){
        for (int i =0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j++) {
                System.out.println(arr[j]);
            }
        }
        return arr;
    }
}
