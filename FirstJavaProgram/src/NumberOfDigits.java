public class NumberOfDigits {
    public static void main(String[] args) {
        int[] nums={18,124,9,1764,98,1};
        System.out.println(FindNumberOfDigits(nums));

    }
    static int FindNumberOfDigits(int[] arr){
         int count=0;
         for (int i : arr) {
            if (even(i)) {//if the number has even number of digits
                count++;
            }
         }
         return count;
    }
    static boolean even(int num){
        String number= String.valueOf(num);
        if (number.length()%2==0) {
            return true;
        }else{
            return false;
        }
        
    }
}
