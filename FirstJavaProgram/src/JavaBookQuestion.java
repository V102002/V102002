import java.util.Scanner;
import java.util.Arrays;

public class JavaBookQuestion {
    public static void main(String[] args) {
        double[] arr = { 1.2, 3.2, 6.5, 4.1, 8.3 };
        arr = growArray(arr, -2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static double[] growArray(double[] arr, int elements) {
        if (elements > 0) {
            double[] newArray = new double[arr.length + elements];
            Scanner inp = new Scanner(System.in);
            for (int i = arr.length; i < newArray.length; i++) {
                System.out.print("Enter a value for element " + i + ": ");
                newArray[i] = inp.nextDouble();
            }
            inp.close();
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            return newArray;
        } else if (elements < 0) {
            if (arr.length + elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements to remove.");
            }
            double[] newArray = new double[arr.length + elements];
            System.arraycopy(arr, 0, newArray, 0, newArray.length);
            return newArray;
        } else {
            return arr;
        }
    }
}
