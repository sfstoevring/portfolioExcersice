public class Rectangle extends Shape {

    //Initialization of primitives
    //
    //
    private double x2Value;
    private double y2Value;
    private double x3Value;
    private double y3Value;
    private double x4Value;
    private double y4Value;




    //Constructors
    //
    //
    public Rectangle(){
        this(1,1,1,2,4,2,4,1);
    }

    public Rectangle(double x2Value, double y2Value, double x3Value, double y3Value, double x4Value, double y4Value) {
        this(1,1,x2Value,y2Value,x3Value,y3Value,x4Value,y4Value);
    }

    public Rectangle(double x1Value, double y1Value, double x2Value, double y2Value, double x3Value, double y3Value, double x4Value, double y4Value) {
        super(x1Value, y1Value);
        this.x2Value = x2Value;
        this.y2Value = y2Value;
        this.x3Value = x3Value;
        this.y3Value = y3Value;
        this.x4Value = x4Value;
        this.y4Value = y4Value;
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

    public double getX4Value() {
        return x4Value;
    }

    public void setX4Value(double x4Value) {
        this.x4Value = x4Value;
    }

    public double getY4Value() {
        return y4Value;
    }

    public void setY4Value(double y4Value) {
        this.y4Value = y4Value;
    }




    //Methods
    //
    //
    @Override
    public void areaOfShape(){
        double area = (x2Value - getX1Value()) * (y4Value - getY1Value());
        System.out.println("Area of rectangle{" + area + "}");
    }

    @Override
    public void circumferenceOfShape(){
        double height = y4Value - getY1Value();
        double width = x2Value - getX1Value();
        double perimeter = (2 * height) + (2 * width);
        System.out.println("Circumference of rectangle{" + perimeter + "}");

    }


    @Override
    public String toString(){
        return "Rectangle{" +
                "x1=" + getX1Value() +
                ", y1=" + getY1Value() +
                ", x2=" + x2Value +
                ", y2=" + y2Value +
                ", x3=" + x3Value +
                ", y3=" + y3Value +
                ", x4=" + x4Value +
                ", y4=" + y4Value +
                "}";
    }
}
