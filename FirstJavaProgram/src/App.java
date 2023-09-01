public class App {
    public static final float PI=(float)3.1415;
    public static void main(String[] args) throws Exception {
        int a=21;
        int b=10;
        float c=9.76f;
        float sum=a+b+c;
        System.out.println("Sum is :"+sum);
        float avg=sum/3;
        System.out.println("Average is: "+avg);
        int breadth =13;
        int length=34;
        int area=length*breadth;
        System.out.println("Area of rectangle: "+ area);
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectaangle: "+perimeter);
        int radius=3;
        System.out.println("Area of circle: "+PI*radius*radius);
        System.out.println("Perimeter of circle: "+2*PI*radius);  
    }
}
