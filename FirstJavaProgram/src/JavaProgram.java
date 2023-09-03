import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,c;
        System.out.print("a: ");
        a=input.nextInt();
        System.out.print("b: ");
        b=input.nextInt();
        System.out.print("c: ");
        c=input.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println("a is the largest");
            }else{
                System.out.println("c is the largest");
            }
        }else if (b>a) {
            if (b>c) {
                System.out.println("b is the largest");
            }else{
                System.out.println("c is the largest");
            }
        }
    }
}
