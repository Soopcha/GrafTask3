package math.tests;

import math.theVector.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class Vector2Test {

    @Test
    public void testGetX() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        Assert.assertEquals(3.0, vector.getX(), 0.0001);
    }
    //delta - это погрешность допустимая

    @Test
    public void testSetX() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        vector.setX(5.0);
        Assert.assertEquals(5.0, vector.getX(), 0.0001);
    }

    @Test
    public void testGetY() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        Assert.assertEquals(4.0, vector.getY(), 0.0001);
    }

    @Test
    public void testSetY() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        vector.setY(6.0);
        Assert.assertEquals(6.0, vector.getY(), 0.0001);
    }

    @Test
    public void testAdd() { //тест сложения
        Vector2D vector1 = new Vector2D(3.0, 4.0);
        Vector2D vector2 = new Vector2D(5.0, 6.0);
        Vector2D result = vector1.add(vector2);
        Assert.assertEquals(8.0, result.getX(), 0.0001);
        Assert.assertEquals(10.0, result.getY(), 0.0001);
    }

    @Test
    public void testSubtract() {
        Vector2D vector1 = new Vector2D(3.0, 4.0);
        Vector2D vector2 = new Vector2D(5.0, 6.0);
        Vector2D result = vector1.subtract(vector2);
        Assert.assertEquals(-2.0, result.getX(), 0.0001);
        Assert.assertEquals(-2.0, result.getY(), 0.0001);
    }

    @Test
    public void testMultiply() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        Vector2D result = vector.multiply(3.0);
        Assert.assertEquals(9.0, result.getX(), 0.0001);
        Assert.assertEquals(12.0, result.getY(), 0.0001);
    }

    @Test
    public void testDivide() {
        Vector2D vector = new Vector2D(12.0, 8.0);
        Vector2D result = vector.divide(2.0);
        Assert.assertEquals(6.0, result.getX(), 0.0001);
        Assert.assertEquals(4.0, result.getY(), 0.0001);
    }

    @Test
    public void testLength() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        Assert.assertEquals(5.0, vector.length(), 0.0001);
    }

    @Test
    public void testNormalize() {
        Vector2D vector = new Vector2D(3.0, 4.0);
        Vector2D result = vector.normalize();
        Assert.assertEquals(0.6, result.getX(), 0.0001);
        Assert.assertEquals(0.8, result.getY(), 0.0001);
    }

    @Test
    public void testDotProduct() {
        Vector2D vector1 = new Vector2D(3.0, 4.0);
        Vector2D vector2 = new Vector2D(5.0, 6.0);
        double result = vector1.dotProduct(vector2);
        Assert.assertEquals(39.0, result, 0.0001);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCrossProduct() {
        Vector2D vector1 = new Vector2D(3.0, 4.0);
        Vector2D vector2 = new Vector2D(5.0, 6.0);
        vector1.crossProduct(vector2);
    }
}
