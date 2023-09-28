public class Student {
    private int studentId;

    // Constructor that takes an integer parameter
    public Student(int studentId) {
        this.studentId = studentId;
    }

    // Copy constructor that takes another instance of Student as a parameter
    public Student(Student other) {
        // Copy the studentId from the other instance
        this.studentId = other.studentId;
    }

    // Getter method to retrieve the studentId
    public int getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        Student student1 = new Student(101);

        // Create a copy of student1 using the copy constructor
        Student student2 = new Student(student1);

        // Illustrate object assignment
        // Now, student1 and student2 are two separate objects with the same studentId
        System.out.println("student1's studentId: " + student1.getStudentId());
        System.out.println("student2's studentId: " + student2.getStudentId());

        // Modify student1's studentId
        student1.studentId = 202;

        // Display the studentIds again to show that student1 and student2 are separate
        System.out.println("After modifying student1:");
        System.out.println("student1's studentId: " + student1.getStudentId());
        System.out.println("student2's studentId: " + student2.getStudentId());
    }
}

