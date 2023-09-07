import java.util.Scanner;
import java.lang.Math;
public class Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        String[] starr=new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < starr.length; i++) {
            starr[i]=input.next();
        }
        for (int i = 0; i < starr.length; i++) {
            System.out.print(starr[i]+" ");
        }








        
        input.close();
    }
}

