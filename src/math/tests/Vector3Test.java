package math.tests;

import math.theVector.Vector3D;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector3Test {

    @Test
    public void testGetX() {
        Vector3D vector = new Vector3D(3.0, 4.0,5);
        Assert.assertEquals(3.0, vector.getX(), 0.0001);
    }
    //delta - это погрешность допустимая

    @Test
    public void testSetX() {
        Vector3D vector = new Vector3D(3.0, 4.0,6);
        vector.setX(5.0);
        Assert.assertEquals(5.0, vector.getX(), 0.0001);
    }

    @Test
    public void testGetY() {
        Vector3D vector = new Vector3D(3.0, 4.0,6);
        Assert.assertEquals(4.0, vector.getY(), 0.0001);
    }

    @Test
    public void testSetY() {
        Vector3D vector = new Vector3D(3.0, 4.0,6);
        vector.setY(6.0);
        Assert.assertEquals(6.0, vector.getY(), 0.0001);
    }
    @Test
    public void testGetZ() {
        Vector3D vector = new Vector3D(3.0, 4.0,6);
        Assert.assertEquals(6.0, vector.getZ(), 0.0001);
    }
    @Test
    public void testSetZ() {
        Vector3D vector = new Vector3D(3.0, 4.0,4);
        vector.setZ(6.0);
        Assert.assertEquals(6.0, vector.getZ(), 0.0001);
    }

    @Test
    public void testAdd() {
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D result = vector1.add(vector2);
        Assert.assertEquals(5.0, result.getX(), 0.0001);
        Assert.assertEquals(7.0, result.getY(), 0.0001);
        Assert.assertEquals(9.0, result.getZ(), 0.0001);
    }

    @Test
    public void testSubtract() {
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D result = vector1.subtract(vector2);
        Assert.assertEquals(-3.0, result.getX(), 0.0001);
        Assert.assertEquals(-3.0, result.getY(), 0.0001);
        Assert.assertEquals(-3.0, result.getZ(), 0.0001);
    }

    @Test
    public void testMultiply() {
        Vector3D vector = new Vector3D(1.0, 2.0, 3.0);
        Vector3D result = vector.multiply(2.0);
        Assert.assertEquals(2.0, result.getX(), 0.0001);
        Assert.assertEquals(4.0, result.getY(), 0.0001);
        Assert.assertEquals(6.0, result.getZ(), 0.0001);
    }

    @Test
    public void testDivide() {
        Vector3D vector = new Vector3D(2.0, 4.0, 6.0);
        Vector3D result = vector.divide(2.0);
        Assert.assertEquals(1.0, result.getX(), 0.0001);
        Assert.assertEquals(2.0, result.getY(), 0.0001);
        Assert.assertEquals(3.0, result.getZ(), 0.0001);
    }

    @Test
    public void testLength() {
        Vector3D vector = new Vector3D(3.0, 4.0, 12.0);
        double length = vector.length();
        assertEquals(13.0, length, 0.01); // Приближенное сравнение с погрешностью 0.01
    }

    @Test
    public void testNormalize() {
        Vector3D vector = new Vector3D(3.0, 4.0, 12.0);
        Vector3D normalized = vector.normalize();
        Assert.assertEquals(3.0/13.0, normalized.getX(), 0.0001);
        Assert.assertEquals(4.0/13.0, normalized.getY(), 0.0001);
        Assert.assertEquals(12.0/13.0, normalized.getZ(), 0.0001);
    }

    @Test
    public void testDotProduct() {
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);
        double result = vector1.dotProduct(vector2);
        assertEquals(32.0, result, 0.01);
    }

    @Test
    public void testCrossProduct() {
        Vector3D vector1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D vector2 = new Vector3D(0.0, 1.0, 0.0);
        Vector3D result = vector1.crossProduct(vector2);
        Assert.assertEquals(0.0, result.getX(), 0.0001);
        Assert.assertEquals(0.0, result.getY(), 0.0001);
        Assert.assertEquals(1.0, result.getZ(), 0.0001);

    }

}
