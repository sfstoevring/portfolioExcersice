public class Circle extends Shape {

    //Initialization of primitives
    //
    //
    private double radius;
    private String name;




    //Constructors
    //
    //
    public Circle(){
        this(1,1,1, "Circle");
    }

    public Circle(double radius, String name) {
        //this.radius = radius;
        this(1,1,radius, name);
    }

    public Circle(double x1Value, double y1Value, double radius, String name) {
        super(x1Value, y1Value);
        this.radius = radius;
        this.name = name;
    }




    //Getters and Setters
    //
    //
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
    //
    //
    @Override
    public void areaOfShape(){
        double area = (getRadius() * getRadius() * Math.PI);
        System.out.println("Area of circle{" + area + "}");
    }

    @Override
    public void circumferenceOfShape(){
        double circumference = Math.PI * (getRadius() * 2);
        System.out.println("Circumference of circle{" + circumference + "}");
    }

    @Override
    public double[] centerOfShape() {
        double xCenter = getX1Value();
        double yCenter = getY1Value();
        System.out.println("Center of circle{" + xCenter + ";" + yCenter + "}");
        double[] outputValues = {xCenter,yCenter};
        return outputValues;
    }

    @Override
    public String toString(){
        return "Circle{" +
                "x1=" + getX1Value() +
                ", y1=" + getY1Value() +
                ", radius=" + radius +
                "}";
    }

    @Override
    public void pointInsideShape(int x, int y) {
        double conditionX = (x-getX1Value())*(x-getX1Value());
        double conditionY = (y-getY1Value())*(y-getY1Value());
        if ( conditionX + conditionY < (radius*radius)){
            System.out.println("Point: {" + x + ", " + y + "} is inside the circle" );
        }
        //else if (conditionX + conditionY == (radius*radius)){System.out.println("Point: {" + x + ", " + y + "} is on the line of the circle" );}
        else {
            System.out.println("Point: {" + x + ", " + y + "} is not inside the circle" );
        }
    }
}
