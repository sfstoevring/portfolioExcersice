import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Rectangle rectangle = new Rectangle(0,0,2,2,"testRectangle");
    Circle circle = new Circle(5, "testCircle");
    Triangle triangle = new Triangle(1,1,4,1,1,5,"testTriangle");

        @Test
        void areaOfShape() {
            assertEquals(4, rectangle.areaOfShape());
            assertEquals(5*5*Math.PI, circle.areaOfShape());
            assertEquals(6, triangle.areaOfShape());
        }

        @Test
        void circumferenceOfShape() {
            assertEquals(2+2+2+2, rectangle.circumferenceOfShape());
            assertEquals(5*2*Math.PI, circle.circumferenceOfShape());
            assertEquals(3+4+5, triangle.circumferenceOfShape());
        }

        @Test
        void centerOfShape() {
            double[] test = {1,1};
            double[] test2 = {2,2.3};

            assertArrayEquals(test, rectangle.centerOfShape());
            assertArrayEquals(test, circle.centerOfShape());
            assertArrayEquals(test2, triangle.centerOfShape(), 0.1);
        }

        @Test
        void distanceBetweenShapes() {
            assertEquals(0, rectangle.distanceBetweenShapes(circle));
            assertEquals(1.6, rectangle.distanceBetweenShapes(triangle), 0.1);
            assertEquals(0, circle.distanceBetweenShapes(rectangle));
            assertEquals(1.6, circle.distanceBetweenShapes(triangle), 0.1);
            assertEquals(1.6, triangle.distanceBetweenShapes(rectangle), 0.1);
            assertEquals(1.6, triangle.distanceBetweenShapes(circle), 0.1);
        }

        @Test
        void pointInsideShape() {
            assertTrue(rectangle.pointInsideShape(1,1));
            assertTrue(circle.pointInsideShape(1,1));
            assertTrue(triangle.pointInsideShape(2,2));
        }
}