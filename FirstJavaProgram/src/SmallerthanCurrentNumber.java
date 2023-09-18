public class SmallerthanCurrentNumber {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        for (int i = 0; i < arr.length; i++) {
            int smallCount=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    if (i!=j) {
                        smallCount++;
                    }
                }
            }
            System.out.println(smallCount);
        }
    }
}
