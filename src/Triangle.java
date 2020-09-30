import java.security.cert.CertPathValidatorException;

public class Triangle extends Shape{

    //Initialization of primitives
    //
    //
    private double x2Value;
    private double y2Value;
    private double x3Value;
    private double y3Value;
    private String name;




    //Constructors
    //
    //
    public Triangle(){
        this(1,1,2,2,3,1, "Triangle");
    }

    public Triangle(double x2Value, double y2Value, double x3Value, double y3Value, String name) {
        this(1,1,x2Value,y2Value,x3Value,y3Value, name);
    }

    public Triangle(double x1Value, double y1Value, double x2Value, double y2Value, double x3Value, double y3Value, String name) {
        super(x1Value, y1Value);
        this.x2Value = x2Value;
        this.y2Value = y2Value;
        this.x3Value = x3Value;
        this.y3Value = y3Value;
        this.name = name;
    }




    //Getters and Setters
    //
    //
    public double getX2Value() {
        return x2Value;
    }

    public void setX2Value(double x2Value) {
        this.x2Value = x2Value;
    }

    public double getY2Value() {
        return y2Value;
    }

    public void setY2Value(double y2Value) {
        this.y2Value = y2Value;
    }

    public double getX3Value() {
        return x3Value;
    }

    public void setX3Value(double x3Value) {
        this.x3Value = x3Value;
    }

    public double getY3Value() {
        return y3Value;
    }

    public void setY3Value(double y3Value) {
        this.y3Value = y3Value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //utility function to calculate area of triangle
    public static double area(double x1, double y1, double  x2, double y2, double x3, double y3){
        return (0.5)*(x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2));
    }


    //Methods
    //
    //
    @Override
    public void areaOfShape(){
        double area = (0.5)*(getX1Value()*(y2Value-y3Value)+x2Value*(y3Value-getY1Value())+x3Value*(getY1Value()-y2Value));
        System.out.println("Area of triangle{" + area + "}");
    }

    @Override
    public void circumferenceOfShape(){
        double tempCathetus1 = Math.sqrt( Math.pow((x2Value-getX1Value()),2) + Math.pow((y2Value-getY1Value()),2) );
        double tempCathetus2 = Math.sqrt( Math.pow((x3Value-x2Value),2) + Math.pow((y3Value-y2Value),2) );
        double tempHypotenuse = Math.sqrt( Math.pow((x3Value-getX1Value()),2) + Math.pow((y3Value-getY1Value()),2) );
        double perimeter = tempCathetus1 + tempCathetus2 + tempHypotenuse;
        System.out.println("Circumference of triangle{" + perimeter + "}");
    }

    @Override
    public double[] centerOfShape() {
        double xCenter = (getX1Value() + x2Value + x3Value) / 3;
        double yCenter = (getY1Value() + y2Value + y3Value) / 3;
        System.out.println("Center of triangle{" + xCenter + ";" + yCenter + "}");
        double[] outputValues = {xCenter,yCenter};
        return outputValues;
    }

    @Override
    public String toString(){
        return "Triangle{" +
                "x1=" + getX1Value() +
                ", y1=" + getY1Value() +
                ", x2=" + x2Value +
                ", y2=" + y2Value +
                ", x3=" + x3Value +
                ", y3=" + y3Value +
                "}";
    }

    @Override
    public void pointInsideShape(int x, int y) {
        double x1 = getX1Value(),
               y1 = getY1Value(),
               x2 = getX2Value(),
               y2 = getY2Value(),
               x3 = getX3Value(),
               y3 = getY3Value();
        //Calculate the full area of the triangle
        double A = Triangle.area(x1, y1, x2, y2, x3, y3);
        //Split full area into three with the point you want to check
        double A1 = Triangle.area(x, y, x2, y2, x3, y3);
        double A2 = Triangle.area(x1, y1, x, y, x3, y3);
        double A3 = Triangle.area(x1, y1, x2, y2, x, y);
        //System.out.println("Area = " + A + " Area1 = " + A1 + " Area2 = " + A2 + " Area3 = " + A3);
        //If the sum of the split triangles is the same as the original sum then the point is inside
        if ((A1 + A2 + A3) == A) {
            System.out.println("Point: {" + x + ", " + y + "} is inside the triangle");
        }else {
            System.out.println("Point: {" + x + ", " + y + "} is not inside the triangle");
        }
    }
}
