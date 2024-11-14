// implementation of the Sphere class
public class Sphere extends Circle {
    // overloading constructors
    Sphere() {
        // goes to Circle no-arg constructor
        // Circle()
        super();
    }
    Sphere(int radius) {
        // goes to Circle parameterized constructor
        // Circle(int radius)
        super(radius);
    }
    public double calcSurfaceArea() {
        // Alt 1: 4 * Math.PI * Math.pow(super.getRadius(), 2)
        // Alt 2:
        return 4 * super.calcArea();
    }
    public double calcVolume() {
        // Alt 1: (4/3) * Math.PI * Math.pow(super.getRadius(), 3)
        // Alt 2:
        return (4/3)* super.calcArea() * super.getRadius();
    }

    @Override
    public String toString() {
        return "Surface Area = " + calcSurfaceArea() +
                " Volume = " + calcVolume() + " " +
                super.toString();
    }
}
