public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        System.out.println(medianInSortedArrays(concatenateSortedArrays(num1, num2)));
    }

static int[] concatenateSortedArrays(int[]a,int[]b){
    int aLen=a.length;
    int bLen=b.length;
    int[] result=new int[aLen+bLen];
    int i=0,j=0,k=0;
    while (i<aLen&&j<bLen) {//add the elements in a sorted manner
        if (a[i]<b[j]) {
            result[k]=a[i];
            k++;i++;
        }else{
            result[k]=b[j];
            k++;j++;
        }
    }
    //if there are reamaining elements in both the elements
    while (i<aLen) {
        result[k]=a[i];
        k++;i++;
    }
    while (j<bLen) {
        result[k]=b[j];
        k++;j++;
    }
    return result;
}
static double medianInSortedArrays(int[]arr){
    int length=arr.length;
    int mid=length/2;
    if (length%2==0) {
        return (arr[mid-1]+arr[mid])/2.0;
    }else{
        return arr[mid];
    }
}
}