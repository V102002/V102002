import java.util.Scanner;

public class NUmberOccurences {
    public static void main(String[] args) {
        int num;
        int number,remainder=0;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=input.nextInt();
        System.out.print("Enter a number to check Occurences:");
        number=input.nextInt();
        while (num>0) {
            remainder=num%10;
            if (remainder==number) {
                count++;
            }
            num=num/10;
        }
        System.out.println("The number "+number+" has occured "+count+" times");
        input.close();
    }
}
