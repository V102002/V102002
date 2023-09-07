import java.util.Scanner;
import java.lang.Math;
public class Roots {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    //Enter three numbers
    int a,b,c;
    System.out.print("Enter the value of a: ");
    a=input.nextInt();
    System.out.print("Enter the value of b: ");
    b=input.nextInt();
    System.out.print("Enter the value of c: ");
    c=input.nextInt();
    int determinant=(int)Math.pow(b,2)-4*a*c;
    if (determinant>0){
        int r1=(int)(-b+(Math.sqrt(determinant)))/2*a;
        int r2=(int)(-b-(Math.sqrt(determinant)))/2*a;
        System.out.println("Roots are: "+r1+" and "+r2);
        }else if (determinant==0) {
            int r1,r2;
            r1=-b/2*a;
            r2=r1;
            System.out.println("The roots are equal, they are: "+r2);
        }else{
            System.out.println("The roots are imaginanry");
        }
    input.close();
    }
}

