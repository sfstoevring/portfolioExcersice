import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10,10,5, "testCircle");
        Triangle triangle = new Triangle(2,8,14,4,12,12, "testTriangle");
        Rectangle rectangle = new Rectangle(14,4,5,3, "testRectangle");

        System.out.println(rectangle.pointInsideShape(3,1));          //Point inside method
        System.out.println(rectangle.distanceBetweenShapes(circle));        //Distance method
        System.out.println(Arrays.toString(rectangle.centerOfShape()));     //Center point method
        System.out.println(rectangle.circumferenceOfShape());               //Circumference method
        System.out.println(rectangle.areaOfShape());                        //Area method
        System.out.println(rectangle.toString());                           //ToString method
    }
}
