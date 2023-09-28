public class MyClass {
    private int value1;
    private String value2;

    // Constructor with no parameters
    public MyClass() {
        this.value1 = 0;
        this.value2 = "Default";
    }

    // Constructor with one parameter
    public MyClass(int value1) {
        this.value1 = value1;
        this.value2 = "Default";
    }

    // Constructor with two parameters
    public MyClass(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // Getter methods
    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(42);
        MyClass obj3 = new MyClass(123, "Hello");

        // Accessing object properties
        System.out.println("Object 1: value1 = " + obj1.getValue1() + ", value2 = " + obj1.getValue2());
        System.out.println("Object 2: value1 = " + obj2.getValue1() + ", value2 = " + obj2.getValue2());
        System.out.println("Object 3: value1 = " + obj3.getValue1() + ", value2 = " + obj3.getValue2());
    }
}

