public class Main {

    public static void main(String[] args) {

        // Koordinater skal følge positiv omløbsretning!
        Circle circle = new Circle(100,100,100, "Circle");
        Triangle triangle = new Triangle(0,0,10,0,5,15, "Triangle");
        Rectangle rectangle = new Rectangle(1,1,10,1,50,40,1,40, "Rectangle");

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

        circle.pointInsideShape(1,1);
        triangle.pointInsideShape(5, 10);
        rectangle.pointInsideShape(5,10);


    }
}
