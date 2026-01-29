package set1;

import java.util.Scanner;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void computeArea(){
        System.out.print("\nArea Of The set1.Circle : " + (radius*Math.PI*radius));

    }
    public void computeCircumferance(){
        System.out.print("\nCircumferance Of set1.Circle :" + (2*radius*Math.PI));
    }

    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter The Radius :");
        double radius = s.nextDouble();
        Circle c= new Circle(radius);
        c.computeCircumferance();
        c.computeArea();


    }
}
