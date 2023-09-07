import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n;
        //get a number
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=input.nextInt();
        isArmstrong(n);
        input.close();
    }
    static boolean isArmstrong(int num){
        int original;
        int sum=0;
        original=num;
        while(num>0){
            int remainder=num%10;
            sum=sum+(int)Math.pow(remainder,3);
            num=num/10;
        }
        if(sum==original){
            System.out.println(original+" is an Armstrong number");
            return true;
        }else{
            System.out.println(original+"is not an Armstrong number");
            return false;
        }
    }
}
