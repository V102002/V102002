public class MaxCandies {
    static int largest(int[]arr){
        int i; 
        // Initialize maximum element
        int max = arr[0]; 
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extra=3;
        boolean[] result=new boolean[5];
        //find the largest number
        int max=largest(candies);
        for (int i = 0; i < candies.length; i++) {
            candies[i]=candies[i]+extra;
        }
        for (int i = 0; i < result.length; i++) {
            if (candies[i]>=max) {
                result[i]=true;
            }else{
                result[i]=false;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            System.out.print(candies[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
}
