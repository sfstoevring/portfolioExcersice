import java.awt.*;

public class Triangle extends Shape{

    //Initialization of primitives
    //
    //
    private double x2Value;
    private double y2Value;
    private double x3Value;
    private double y3Value;




    //Constructors
    //
    //
    public Triangle(){
        this(1,1,2,2,3,1);
    }

    public Triangle(double x2Value, double y2Value, double x3Value, double y3Value) {
        this(1,1,x2Value,y2Value,x3Value,y3Value);
    }

    public Triangle(double x1Value, double y1Value, double x2Value, double y2Value, double x3Value, double y3Value) {
        super(x1Value, y1Value);
        this.x2Value = x2Value;
        this.y2Value = y2Value;
        this.x3Value = x3Value;
        this.y3Value = y3Value;
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
    public void centerOfShape() {
        double xCenter = (getX1Value() + x2Value + x3Value) / 3;
        double yCenter = (getY1Value() + y2Value + y3Value) / 3;
        System.out.println("Center of triangle{" + xCenter + ";" + yCenter + "}");
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

}
