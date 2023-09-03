import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,reverse=0;
        System.out.print("Enter a number:");
        num=input.nextInt();
        System.out.println("Reversing The Number");
        while (num>0) {
            int remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;
        }
        System.out.println(reverse);
        input.close();
    }
}
