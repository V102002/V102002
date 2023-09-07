public class Factorial {
    public static void main(String[] args) {
        factorial(4);
    }
    static int factorial(int num){
        int fact=1;
        for (int i = 1; i <=num; i++){
        fact=fact*i;
        }
        System.out.println("Factorial of "+ num+ "is"+fact);
        if (num==0){
        return 1;
        }
        return fact;
    }
}
