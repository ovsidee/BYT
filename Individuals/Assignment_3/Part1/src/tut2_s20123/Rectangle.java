package tut2_s20123;

public class Rectangle implements IShape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateVolume() {
        // For 2D shapes, volume is not applicable.
        // Height of 2D shape is 0, therefore volume is 0
        return 0;
    }
}
