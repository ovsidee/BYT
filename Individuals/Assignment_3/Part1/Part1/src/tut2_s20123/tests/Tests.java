package tut2_s20123.tests;

import tut2_s20123.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    private final IShape sphere = new Sphere(5);
    private final IShape cube = new Cube(4);
    private final IShape cylinder = new Cylinder(2, 5);
    private final IShape rectangle = new Rectangle(2, 5);

    @Test
    public void testSphereCalculateArea() {
        assertEquals(314.159, sphere.calculateArea(), 0.001);
    }

    @Test
    public void testSphereCalculateVolume() {
        assertEquals(523.598, sphere.calculateVolume(), 0.001);
    }

    // ------- mine (added):
    @Test
    public void testCubeCalculateArea() {
        assertEquals(96, cube.calculateArea());
    }

    @Test
    public void testCubeCalculateVolume() {
        assertEquals(64, cube.calculateVolume());
    }

    @Test
    public void testCylinderCalculateArea() {
        assertEquals(87.965, cylinder.calculateArea(), 0.001);
    }

    @Test
    public void testCylinderCalculateVolume() {
        assertEquals(62.832, cylinder.calculateVolume(), 0.001);
    }

    @Test
    public void testRectangleCalculateArea() {
        assertEquals(10, rectangle.calculateArea());
    }

    @Test
    public void testRectangleCalculateVolume() {
        assertEquals(0, rectangle.calculateVolume());
    }
}