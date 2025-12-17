abstract class Shape {
   abstract void calculateArea();

   void displayShape() {
    System.out.println("This is a shape");
   }
}

class Rectangle extends Shape {
    double length ;
    double width ;

Rectangle(double length , double width) {
    this.length = length;
    this.width = width ;
}
@Override
void calculateArea() {
    double area = length * width ;
    System.out.println("Area of Rectangle" + area);
 }
}
class Circle extends Shape {
    double radius ;


Circle (double radius) {
    this.radius = radius;
}
@Override
void calculateArea() {
    double area = 3.1416 * radius ;
    System.out.println("Area of Circle" + area);
}
}
public class Rhrh {
    public static void main(String[] args) {
        Shape Circle = new Circle(7);
        Shape Rectangle = new Rectangle(10, 5);

        Circle.displayShape();
        Circle.calculateArea();

        Rectangle.displayShape();
        Rectangle.calculateArea();
    }
    
}
