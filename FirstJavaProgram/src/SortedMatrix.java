public class SortedMatrix {
    public static void main(String[] args) {
        
    }
    static int[] BinarySearch(int[][] matrix, int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd) {
            int mid=cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target) {
                return new int[]{row,mid};
            }if (matrix[row][mid]<target) {
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if (rows==1) {
            return BinarySearch(matrix,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while (rStart<(rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if (matrix[mid][cMid]==target) {
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target) {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have 2 rows
        //check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid]==target) {
            return new int[]{rStart,cMid};//the top row check
        }
        if (matrix[rStart+1][cMid]==target) {
            return new int[]{rStart+1,cMid};//the last row check
        }
    }
}
