class Circle {

    private double radius = 1;
    private String color = "Red";

    Circle() {

    }

    Circle(double r) {

    }

    Circle(double r, String col) {
        radius = r;
        color = col;
    }


    double getRadius() {
        return radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getColor() {
        return color;
    }

    void setColor(String c) {
        color = c;
    }

    double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }


    String toString() {
        return("Radius is : "+radius + "Color is : "+color );
    }

}

class Cylinder extends Circle{

    private double height = 1.0;

    Cylinder() {
        height = 1.0;
    }

    Cylinder(double r) {
        super(r);
    }

    Cylinder(double r, double h) {
        super(r);
    }
    

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    void setVolume(double r ) {
        double vol = 3.14 * r * r * height;
        
    }

    double getVolume() {
        return vol;
    }





}

class Demo {
    public static void main(String args[]) {
        
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10.0)
        Cylinder c3 = new Cylinder(2.0, 10.0);


    }
}