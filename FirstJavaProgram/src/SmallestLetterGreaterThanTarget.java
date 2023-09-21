public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        char target='c';
        System.out.println(Ceiling(letter, target));
    }   
    static char Ceiling(char[] arr, char target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return arr[start];
    }
}
