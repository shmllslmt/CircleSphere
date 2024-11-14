public class Main {
    // Use the classes that we've created
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius: "+circle1.getRadius());
        System.out.println("Area: "+circle1.calcArea());

        Circle circle2 = new Circle(7);
        System.out.println("Circle 2 Radius: "+circle2.getRadius());
        System.out.println("Circle 2 Area: "+ String.format("%.2f", circle2.calcArea()));

        Sphere sphere1 = new Sphere(10);
        System.out.println("Sphere Radius: "+sphere1.getRadius());
        System.out.println("Sphere Area: "+ String.format("%.2f", sphere1.calcArea()));
        System.out.println("Sphere Surface Area: " + sphere1.calcSurfaceArea());
        System.out.println("Sphere Volume: " + sphere1.calcVolume());

        System.out.println(sphere1);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}