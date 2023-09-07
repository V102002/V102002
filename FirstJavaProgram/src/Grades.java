import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int count;
        int totalMarks=0,percentage;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        count=input.nextInt();
        System.out.println("Enter marks of each subject");
        for (int i = 0; i < count; i++) {
            totalMarks+=input.nextInt();
        }
        System.out.println("Total Marks: "+ totalMarks);
        percentage=(totalMarks/(count*100))*100;
        switch ((int)percentage/10) {
            case 9:
                System.out.println("A+");
                break;
            case 8:
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
        input.close();
    }
}
