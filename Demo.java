public class Demo {
   
        public static void main(String[] args) {

                    // Instance variables
            Shape S = new Shape("Red", true);
            Circle C = new Circle(5.0);

            Circle C1 = new Circle(5.0,"blue",true);
            Rectangle R = new Rectangle(2.0,3.0);
            Rectangle R1 = new Rectangle(2.0,3.0,"green",false);
            Square Sq = new Square(4.0);
            Square Sq1 = new Square(4.0,"yellow",true);
            System.out.println();


            System.out.println(S.toString());
            System.out.println(C.toString());
            System.out.println(C1.toString());
            System.out.println(R.toString());
            System.out.println(R1.toString());
            System.out.println(Sq.toString());
            System.out.println(Sq1.toString());
            System.out.println();

            System.out.println("Circle C[ Area: " + C.getArea() + " Perimeter: " + C.getPerimeter() + " ]");
            System.out.println("Circle C1[ Area: " + C1.getArea() + " Perimeter: " + C1.getPerimeter()+ " ]");
            System.out.println("Rectangle R[ Area: " + R.getArea() + " Perimeter: " + R.getPerimeter()+ " ]");
            System.out.println("Rectangle R1[ Area: " + R1.getArea() + " Perimeter: " + R1.getPerimeter()+ " ]");
            System.out.println("Square Sq [ Area: " + Sq.getArea() + " Perimeter: " + Sq.getPerimeter()+ " ]");
            System.out.println("Square Sq1 [ Area: " + Sq1.getArea() + " Perimeter: " + Sq1.getPerimeter()+ " ]");
        }
    
}
