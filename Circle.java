public class Circle extends Shape{
    protected double radius;
    
    public Circle(double radius) {
        this.radius = 1;
    }

    public Circle(double radius, String color, boolean filled) {
    super(color, filled);
        this.radius = radius;

    }
    // getters method
    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    //setters method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(String perimeter) {
        return "Circle[The radius of a circle is: = " + radius + " Perimeter= " + perimeter + "]";
    }


}

