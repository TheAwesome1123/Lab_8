package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TwoPointsTest {
    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }
    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -
                3);
        testPoints.setPoint(1,
                -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y,
                -3);
        assertEquals(p2.x,
                -3);
        assertEquals(p2.y, 5);
    }

    @Test
    public void randomValue() {
        TwoPoints twoPoints = new TwoPoints();
        twoPoints.randomValue(0);
        assertTrue(twoPoints.getPoint(0).x >= -10 &&
                twoPoints.getPoint(0).x < 10);
        assertTrue(twoPoints.getPoint(0).y >= -10 &&
                twoPoints.getPoint(0).y < 10);
    }

    @Test
    public void setOrigin() {
        TwoPoints twoPoints = new TwoPoints();
        twoPoints.setOrigin(0);
        Point p1 = twoPoints.getPoint(0);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
    }

    @Test
    public void copy() {
        TwoPoints twoPoints = new TwoPoints();
        twoPoints.setPoint(0, 5, 5);
        twoPoints.copy(0, 1);
        Point p0 = twoPoints.getPoint(0);
        Point p1 = twoPoints.getPoint(1);
        assertEquals(p0.x, p1.x);
        assertEquals(p0.y, p1.y);
    }

    @Test
    public void distance() {
        TwoPoints twoPoints = new TwoPoints();
        twoPoints.setPoint(0, 2, 2);
        twoPoints.setPoint(1, 3 ,3);
        int distance = twoPoints.distance();
        assertEquals(1, distance);
    }

    @Test
    public void slope() {
        TwoPoints twoPoints = new TwoPoints();
        twoPoints.setPoint(0 , 2, 2);
        twoPoints.setPoint(1, 3, 3);
        double slope = twoPoints.slope();
        assertEquals(1, slope);
    }
}