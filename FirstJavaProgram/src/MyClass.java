// Define a Java class named MyClass
public class MyClass {
    // Declare private instance variables value1 and value2
    private int value1;
    private String value2;

    // Constructor with no parameters
    public MyClass() {
        // Initialize value1 to 0 and value2 to "Default"
        this.value1 = 0;
        this.value2 = "Default";
    }

    // Constructor with one parameter
    public MyClass(int value1) {
        // Initialize value1 with the provided value and value2 to "Default"
        this.value1 = value1;
        this.value2 = "Default";
    }

    // Constructor with two parameters
    public MyClass(int value1, String value2) {
        // Initialize value1 and value2 with the provided values
        this.value1 = value1;
        this.value2 = value2;
    }

    // Getter methods to retrieve values
    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using different constructors

        // Create an object using the default constructor
        MyClass obj1 = new MyClass();

        // Create an object using the constructor with an integer parameter
        MyClass obj2 = new MyClass(42);

        // Create an object using the constructor with an integer and a string parameter
        MyClass obj3 = new MyClass(123, "Hello");

        // Accessing object properties and printing them
        System.out.println("Object 1: value1 = " + obj1.getValue1() + ", value2 = " + obj1.getValue2());
        System.out.println("Object 2: value1 = " + obj2.getValue1() + ", value2 = " + obj2.getValue2());
        System.out.println("Object 3: value1 = " + obj3.getValue1() + ", value2 = " + obj3.getValue2());
    }
}
