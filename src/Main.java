import java.awt.*; //imports all awt libraries
import javax.swing.*; //imports all swing libraries

public class Main {


    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.createFrame(600,600);




        // Koordinater skal følge positiv omløbsretning!

        Circle circle = new Circle(4,7,4);

        Triangle triangle = new Triangle(1,1,5,1,1,4);

        Rectangle rectangle = new Rectangle(1,1,4,1,4,4,1,4);

        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());

        circle.areaOfShape();
        triangle.areaOfShape();
        rectangle.areaOfShape();

        circle.circumferenceOfShape();
        triangle.circumferenceOfShape();
        rectangle.circumferenceOfShape();
    }
}
