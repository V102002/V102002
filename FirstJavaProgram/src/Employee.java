public class Employee {
    int id;
    String firstName;
    String lastName;
    int Salary;
    public  Employee(int id,String firstName,String lastName,int Salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Salary=Salary;
    }
    public static void main(String[] args) {
        Employee ep=new Employee(10,"Peter","Tan",2500);
        System.out.println(ep);
        ep.raiseSalary(10);
        System.out.println(ep);
        Employee ep2=new Employee(1, "Tom", "Clancy", 10000);
        System.out.println(ep2);
        ep2.raiseSalary(5);
        System.out.println(ep2);
        
    }
    public int getId(){
        return id;
    }
    public String getFirstName(String FirstName){
        return firstName;
    }
    public String getLastName(String LastName){
        return lastName;
    }
    public int getSalary(int Salary){
        return Salary;
    }
    public String GetName(String FirstName,String LastName){
        return FirstName+" "+LastName;
    }
    public void SetSalary(int Salary){
        this.Salary=Salary;
    }
    public int GetAnnualSalary(int Salary){
        return Salary*12;
    }
    public int raiseSalary(int percentage){
        this.Salary=Salary+Salary*percentage;
        return Salary;
    }
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + firstName + " " + lastName + ", Salary=" + Salary + "]";
    }
    
    
}
