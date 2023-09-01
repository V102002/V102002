import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter number for num1:");
        num1=input.nextInt();
        System.out.print("Enter number for num2:");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.print("Sum:"+sum);
        
    }
}
