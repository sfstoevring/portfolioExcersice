public class Main {

    public static void main(String[] args) {

        // Koordinater skal følge positiv omløbsretning!
        Circle circle = new Circle(250,250,100);
        Triangle triangle = new Triangle(1,1,5,1,1,4);
        Rectangle rectangle = new Rectangle(1,1,500,1,500,400,1,400);

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

    }
}
