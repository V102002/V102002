import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=input.nextInt();
        System.out.println("The sum of"+n+" numbers is:"+sumOfnNumbers(n));
        input.close();
    }
    static int sumOfnNumbers(int num){
        int sum=(num*(num+1))/2;
        return sum;
    }
    
}
