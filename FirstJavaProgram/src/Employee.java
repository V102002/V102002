public class Employee {
    int id;
    String firstName;
    String lastName;
    int Salary;
    public static void main(String[] args) {
        Employee ep=new Employee(8, "Peter", "Tan", 2500);
    }
    public Employee(int id,String firstName,String lastName,int Salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Salary=Salary;

    }
}
