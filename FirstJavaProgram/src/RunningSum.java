public class RunningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
            int[]ans=new int[4];
            int sum=0;
            for (int i = 0; i < ans.length; i++) {
                ans[i]=sum+arr[i];
                sum=sum+arr[i];
            }
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]+" ");
            }
    }
}
