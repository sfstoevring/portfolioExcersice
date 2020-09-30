public abstract class Shape {
    //Initialization of primitives
    //
    //
    private double x1Value;
    private double y1Value;



    //Constructors
    //
    //
    /**
     * Default constructor for a shape
     * @param x1Value = x-value in a coordinate
     * @param y1Value = y-value in a coordinate
     */
    public Shape(double x1Value, double y1Value) {
        this.x1Value = x1Value;
        this.y1Value = y1Value;
    }




    //Getters and Setters
    //
    //
    /**
     * Getter for the x1Value
     * @return x1Value
     */
    public double getX1Value() {
        return x1Value;
    }

    /**
     * Setter for the x1Value
     * @param x1Value = new passed value
     */
    public void setX1Value(double x1Value) {
        this.x1Value = x1Value;
    }

    /**
     * Getter for the y1Value
     * @return y1Value
     */
    public double getY1Value() {
        return y1Value;
    }

    /**
     * Setter for the y1Value
     * @param y1Value = new passed value
     */
    public void setY1Value(double y1Value) {
        this.y1Value = y1Value;
    }




    //Methods
    //
    //
    /**
     * Calculates the area of a given shape
     */
    public abstract double areaOfShape();

    /**
     * Calculates the circumference of a given shape
     */
    public abstract void circumferenceOfShape();

    /**
     * Calculates the center of a given shape
     */
    public abstract double[] centerOfShape();

    /**
     * Calculates the distance (center <--> center) between two shapes
     * @param shape1 = array of center coordinates from shape #1
     * @param shape2 = array of center coordinates from shape #2
     */
    public void distanceBetweenShapes(double[] shape1, double[] shape2){
        double distance = Math.sqrt( Math.pow((shape2[0] - shape1[0]), 2) + Math.pow((shape2[1] - shape1[1]), 2));
        System.out.println("Distance between the two shapes{" + distance + "}");
    }

    /**
     * Method for printing the content of an object
     * @return relevant fields of a given object
     */
    public String toString(){
        return "default toString";
    }
}
