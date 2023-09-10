import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        int ros,cols,sum=0;
        int max=Integer.MIN_VALUE;
        Scanner in=new Scanner(System.in);
        ros=in.nextInt();
        cols=in.nextInt();
        int[][] accounts=new int[ros][cols];
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(accounts[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < cols; j++) {
                sum=sum+accounts[i][j];
                if (sum>max) {
                    max=sum;
                }
            }
            sum=0;
        }
        System.out.println(max);
        in.close();
    }
}
