// implementation of the Circle class
public class Circle {
    // attribute
    private int radius;

    // overloading constructors
    // no-arg constructor
    Circle() {
        this.radius = 0;
    }

    // parameterized constructor
    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int calcDiameter() {
        return 2 * radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // provide descriptive information about the object

    @Override
    public String toString() {
        return "Radius = " + radius +
                " Diameter = " + calcDiameter() +
                " Perimeter = " + calcPerimeter() +
                " Area = " + calcArea();
    }
}

