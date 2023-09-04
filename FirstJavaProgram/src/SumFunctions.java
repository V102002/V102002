import java.util.Scanner;

public class SumFunctions {
    static void Sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("a:");
        int a=input.nextInt();
        System.out.print("b:");
        int b=input.nextInt();
        int sum=a+b;
        input.close();
        System.out.println("Sum is:"+sum);
    }
    public static void main(String[] args) {
        Sum();
    }
    
}
