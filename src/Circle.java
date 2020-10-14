public class Circle extends Shape {

    //Initialization of class fields
    private double radius;
    private String name;

    //Constructors
    public Circle(){
        this(1,1,1, "defaultCircle");
    }
    public Circle(double radius, String name) {
        this(1,1,radius, name);
    }
    public Circle(double x1Value, double y1Value, double radius, String name) {
        super(x1Value, y1Value);
        this.radius = radius;
        this.name = name;
    }

    //Getters and Setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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
        double area = (getRadius() * getRadius() * Math.PI);
        if(area < 0) area *= (-1);
        return area;
    }

    @Override
    public double circumferenceOfShape(){
        double circumference = Math.PI * (getRadius() * 2);
        return circumference;
    }

    @Override
    public double[] centerOfShape() {
        double xCenter = getX1Value();
        double yCenter = getY1Value();
        double[] outputValues = {xCenter,yCenter};
        return outputValues;
    }

    public double distanceBetweenShapes(Shape shape){
        double distance = Math.sqrt( Math.pow((shape.centerOfShape()[0] - this.centerOfShape()[0]), 2) + Math.pow((shape.centerOfShape()[1] - this.centerOfShape()[1]), 2));
        return distance;
    }

    public boolean pointInsideShape(double x, double y) {
        double distance = Math.sqrt( Math.pow((this.getX1Value() - x), 2) + Math.pow((this.getY1Value() - y), 2));
        if(distance <= this.getRadius()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return "Circle{" +
                "x1=" + getX1Value() +
                ", y1=" + getY1Value() +
                ", radius=" + radius +
                ", name=" + name +
                "}";
    }
}
