import java.util.Scanner;

public class JavaQuestion {
    static final float PI=3.14f;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num=input.nextInt();
        System.out.println(PrimeNumber(num));
        input.close();
    }
    static boolean PrimeNumber(int num){
        //prove it to be false for all case and return true otherwise
        if (num<=1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
