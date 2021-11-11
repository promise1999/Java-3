public class Rectangle extends Shape{
    private static final String parameter = null;
    private static boolean filled;
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width, double length){
        super(color, filled);  
        this.width = width;
        this.length = length;
    }
    // constructors
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);    
            this.length = length;
            this.width = width;
    }
    // getter method
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return length * width * 2;
    }
    // setters method
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    // to string method
    @Override
    public String toString() {
        return "Rectangle[length = " + length + ", width = " + width + ", , parameter = " + parameter + "]";
    }
}
