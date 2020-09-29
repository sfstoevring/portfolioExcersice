public class Circle extends Shape {

    //Initialization of primitives
    //
    //
    private double radius;




    //Constructors
    //
    //
    public Circle(){
        this(1,1,1);
    }

    public Circle(double radius) {
        //this.radius = radius;
        this(1,1,radius);
    }

    public Circle(double x1Value, double y1Value, double radius) {
        super(x1Value, y1Value);
        this.radius = radius;
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
    public String toString(){
        return "Circle{" +
                "x1=" + getX1Value() +
                ", y1=" + getY1Value() +
                ", radius=" + radius +
                "}";
    }
}
