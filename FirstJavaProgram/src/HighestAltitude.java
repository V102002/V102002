public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,-1,4,3,2};       
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain){
        int[] altitudes=new int[gain.length];
        int max=0;
        for (int i = 1; i < gain.length; i++) {
            altitudes[0]=0;
            altitudes[i]=gain[i-1]+altitudes[i-1];
            max=Math.max(altitudes[i-1], altitudes[i]);
        }
        return max==0?0:max;
    }
}
 