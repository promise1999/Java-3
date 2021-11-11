public class Shape {
    protected static String color;
    protected boolean filled;

    public Shape(){
        color = "red";
        filled = "false" != null;
    }
    // constructor
    public Shape(String color, boolean filled) {
        Shape.color = color;
        this.filled = filled;
    }
    
    // getters method
    public String getColor() {
        return color;
    }
    // setters method
    public void setColor(String color) {
        Shape.color = color;
    }
    public void isFilled(Boolean filled) {
        this.filled = filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public double getArea() {
        return 0;
    }
    public char[] isFilled() {
        return null;
    }
    @Override
    public String toString() {
        return "Shape[color = " + color + " filled / not filled = " + filled + "]";
    }
    
}
