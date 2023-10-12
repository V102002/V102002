class Main {
    public void print(){
        System.out.println("There is an animal");
    }
}
class Dog extends Main{
    @Override
    public void print(){
        System.out.println("It is a dog");
    }
    public void PRINTMessage(){
        super.print();
        print();
    }
}
public class Animal{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.PRINTMessage();
    }
}
