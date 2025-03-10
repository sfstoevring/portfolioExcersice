public class Triangle extends Shape{

    //Initialization of class fields
    private double x2Value;
    private double y2Value;
    private double x3Value;
    private double y3Value;
    private String name;

    //Constructors
    public Triangle(){
        this(1,1,2,2,3,1, "defaultTriangle");
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

    //Methods
    @Override
    public double areaOfShape(){
        double area = (0.5)*(getX1Value()*(y2Value-y3Value)+x2Value*(y3Value-getY1Value())+x3Value*(getY1Value()-y2Value));
        if(area < 0) area *= (-1);
        return area;
    }

    @Override
    public double circumferenceOfShape(){
        double tempCathetus1 = Math.sqrt( Math.pow((x2Value-getX1Value()),2) + Math.pow((y2Value-getY1Value()),2) );
        double tempCathetus2 = Math.sqrt( Math.pow((x3Value-x2Value),2) + Math.pow((y3Value-y2Value),2) );
        double tempHypotenuse = Math.sqrt( Math.pow((x3Value-getX1Value()),2) + Math.pow((y3Value-getY1Value()),2) );
        double perimeter = tempCathetus1 + tempCathetus2 + tempHypotenuse;
        return perimeter;
    }

    @Override
    public double[] centerOfShape() {
        double xCenter = (getX1Value() + x2Value + x3Value) / 3;
        double yCenter = (getY1Value() + y2Value + y3Value) / 3;
        double[] outputValues = {xCenter,yCenter};
        return outputValues;
    }

    public boolean pointInsideShape(double x, double y) {
        Triangle tempTriangle1 = new Triangle(this.getX1Value(), this.getY1Value(), this.getX2Value(), this.getY2Value(), x, y,"tempTriangle1");
        Triangle tempTriangle2 = new Triangle(x, y, this.getX2Value(), this.getY2Value(), this.getX3Value(), this.getY3Value(), "tempTriangle2");
        Triangle tempTriangle3 = new Triangle(this.getX1Value(), this.getY1Value(), x, y, this.getX3Value(), this.getY3Value(), "tempTriangle3");

        double areaOfTempTriangle1 = tempTriangle1.areaOfShape();
        double areaOfTempTriangle2 = tempTriangle2.areaOfShape();
        double areaOfTempTriangle3 = tempTriangle3.areaOfShape();
        double areaOfT = this.areaOfShape();

        if(areaOfT == (areaOfTempTriangle1 + areaOfTempTriangle2 + areaOfTempTriangle3)){
            return true;
        } else {
            return false;
        }
    }

    public double distanceBetweenShapes(Shape shape){
        double distance = Math.sqrt( Math.pow((shape.centerOfShape()[0] - this.centerOfShape()[0]), 2) + Math.pow((shape.centerOfShape()[1] - this.centerOfShape()[1]), 2));
        return distance;
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
                ", name=" + name +
                "}";
    }
}
