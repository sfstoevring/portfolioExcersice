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
    public double areaOfShape(){
        double area = (getRadius() * getRadius() * Math.PI);
        System.out.println("Area of circle{" + area + "}");
        return area;
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

    /**
     * Calculates whether a coordinate is within a circle shape
     */
    public void pointInsideShape(Circle c, double x, double y) {

        double distance = Math.sqrt( Math.pow((c.getX1Value() - x), 2) + Math.pow((c.getY1Value() - y), 2));
        if(distance <= c.getRadius()){
            System.out.println("The passed point{" + x + ";" + y + "} is inside '" + c.getName() + "'");
        } else {
            System.out.println("The passed point{" + x + ";" + y + "} is not inside '" + c.getName() + "'");
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
