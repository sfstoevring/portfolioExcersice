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
     * Calculates the center of a given shape
     */
    public void centerOfShape(){} //make abstract!

    /**
     * Calculates the area of a given shape
     */
    public abstract void areaOfShape();

    /**
     * Calculates the circumference of a given shape
     */
    public abstract void circumferenceOfShape();

    /**
     * Calculates whether a coordinate is within a given shape
     * @return true or false
     */
    public boolean pointInsideShape(){
        return true;
    }

    /**
     * Calculates the distance (center -> center) between to shapes
     * @param i = shape #1
     * @param j = shape #2
     */
    public void distanceBetweenShapes(Shape i, Shape j){
        //Euclidian distance method
    }

    /**
     * Method for printing the content of an object
     * @return relevant fields of a given object
     */
    public String toString(){
        return "test";
    }
}
