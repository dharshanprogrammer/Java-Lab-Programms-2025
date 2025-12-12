import java.util.Scanner;
class Rectangle {
    float length,breadth;
    Rectangle(float length, float breadth){
        this.breadth = breadth;
        this.length = length;
    }
    public void computeArea()
    {
       System.out.println("  Area Of The ReactAngle : " + (length*breadth));
    }

    public static void main(String[] args){
        float breadth,length;
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter The  Breadth");
        breadth = s.nextFloat();
        System.out.print("\nEnter The  Length");
        length = s.nextFloat();
        Rectangle r = new Rectangle(length,breadth);
        r.computeArea();

    }

}
