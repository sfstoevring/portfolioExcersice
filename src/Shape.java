public abstract class Shape {
    //Initialization of class fields
    private double x1Value;
    private double y1Value;

    //Constructors
    public Shape(double x1Value, double y1Value) {
        this.x1Value = x1Value;
        this.y1Value = y1Value;
    }

    //Getters and Setters
    public double getX1Value() {
        return x1Value;
    }
    public void setX1Value(double x1Value) {
        this.x1Value = x1Value;
    }
    public double getY1Value() {
        return y1Value;
    }
    public void setY1Value(double y1Value) {
        this.y1Value = y1Value;
    }

    //Methods
    /**
     * Calculates the area of a given shape
     */
    public abstract double areaOfShape();

    /**
     * Calculates the circumference of a given shape
     */
    public abstract double circumferenceOfShape();

    /**
     * Calculates the center of a given shape
     */
    public abstract double[] centerOfShape();

    /**
     * Calculates the distance (center <--> center) between two shapes
     * @param shape = the other object
     */
    public abstract double distanceBetweenShapes(Shape shape);

    /**
     * Calculates whether a coordinate is within a circle shape
     */
    public abstract boolean pointInsideShape(double x, double y);

    /**
     * Method for printing the content of an object
     * @return relevant fields of a given object
     */
    public String toString(){
        return "default toString";
    }
}
