import java.util.Scanner;

public class NumberCalculator {

    private int[] numbers;
    public NumberCalculator(int[] numbers){
        this.numbers=numbers;
    }

    public double calculateAverage(){
        int sum=0;
        for (int numbers : numbers) {
            sum+=numbers;
        }
        return (double) sum/numbers.length;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Number of elements: ");
        int num=input.nextInt();

        int[] number_Array=new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <num ; i++) {
            number_Array[i]=input.nextInt();
        }

        NumberCalculator calculator = new NumberCalculator(number_Array);
		double average = calculator.calculateAverage(); // calling average
		System.out.println("Average of numbers is :"+average); // printing average


        input.close();
    }

}
