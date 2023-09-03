import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int firstTerm=0;
        int SecondTerm=1;
        int times;
        System.out.print("Enter number of times:");
        times=input.nextInt();
        for (int i = 1; i <= times; i++) {
            System.out.print(firstTerm+" ");
            int nextTerm=firstTerm+SecondTerm;
            firstTerm=SecondTerm;
            SecondTerm=nextTerm;
        }
        System.out.println();
        System.out.println(SecondTerm);

    }
}
