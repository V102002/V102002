import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num,reversed=0;
        Scanner input=new Scanner(System.in);//get the number
        num=input.nextInt();
        int original=num;
        while (num>0) {
            int remainder=num%10;
            reversed=(reversed*10)+remainder;
            num=num/10;
        }
        if (reversed==original) {
            System.out.println(original+" is a palindrome");
        }
        input.close();
    }
}
