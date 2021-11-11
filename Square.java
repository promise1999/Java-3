public class Square extends Rectangle{

    // Constant Variable
    public Square(){
        super();
    }
    // parameterized Constructor
    public Square(double side) {
        super(side , side);
    }
    // Super Constructor
    public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
        
        
    }
    // getters method
    public double getSide(){
        return super.getLength();
    }
    // setters method
    public void setSide(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double length) {
        super.setLength(length);
    }

    // to string method
    @Override
    public String toString() {
        return "Square[side = " + getSide() + " which is a subclass of " + super.toString() + "]";

    }
}
