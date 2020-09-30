public class Main {

    public static void main(String[] args) {

        // Koordinater skal følge positiv omløbsretning!
        Circle circle = new Circle(10,10,5, "testCircle");
        Triangle triangle = new Triangle(2,8,14,4,12,12, "testTriangle");
        Rectangle rectangle = new Rectangle(1,1,10,1,10,5,1,5, "testRectangle");

        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());

        circle.areaOfShape();
        triangle.areaOfShape();
        rectangle.areaOfShape();

        circle.circumferenceOfShape();
        triangle.circumferenceOfShape();
        rectangle.circumferenceOfShape();

        circle.centerOfShape();
        triangle.centerOfShape();
        rectangle.centerOfShape();

        circle.distanceBetweenShapes(circle.centerOfShape(), triangle.centerOfShape());
        triangle.distanceBetweenShapes(triangle.centerOfShape(), rectangle.centerOfShape());
        rectangle.distanceBetweenShapes(rectangle.centerOfShape(), circle.centerOfShape());

        circle.pointInsideShape(circle, 12, 8);
        triangle.pointInsideShape(triangle, 10, 11);
        rectangle.pointInsideShape(rectangle, 4, 3);


    }
}
