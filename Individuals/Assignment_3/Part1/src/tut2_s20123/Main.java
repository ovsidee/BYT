package tut2_s20123;

public class Main {
    public static void main(String[] args) {
        // Create a Sphere with radius 5
        IShape sphere = new Sphere(5);
        System.out.println("Sphere:");
        System.out.printf("Area: %.3f%n", sphere.calculateArea());
        System.out.printf("Volume: %.3f%n%n", sphere.calculateVolume());

        // Create a Cylinder with radius 3 and height 7
        IShape cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder:");
        System.out.printf("Area: %.3f%n", cylinder.calculateArea());
        System.out.printf("Volume: %.3f%n%n", cylinder.calculateVolume());

        // Create a Rectangle with length 4 and width 8
        IShape rectangle = new Rectangle(4, 8);
        System.out.println("Rectangle:");
        System.out.printf("Area: %.3f%n", rectangle.calculateArea());
        System.out.printf("Volume: %.3f%n%n", rectangle.calculateVolume());

        // Create a Cube with side 4
        IShape cube = new Cube(4);
        System.out.println("Cube:");
        System.out.printf("Area: %.3f%n", cube.calculateArea());
        System.out.printf("Volume: %.3f%n", cube.calculateVolume());
    }
}
