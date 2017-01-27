package edu.stonehill.cs.bdugan.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bdugan on 1/26/17.
 */

public class TriangleUnitTest {
    @Test
    public void construction_isCorrect() throws Exception {
        Triangle t = new Triangle(1,1,1);

        assert(t.isValid());
    }

    @Test
    public void construction_isIncorrect() throws Exception {
        Triangle t = new Triangle(-1,-1,-1);

        assert(!t.isValid());
    }

    @Test
    public void isEquilateral() throws Exception {
        Triangle t = new Triangle(1,1,1);

        assert(t.isValid());
        assert(t.isEquilateral());
        assert(t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isIsocolesA() throws Exception {
        Triangle t = new Triangle(1,1,2);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isIsocolesB() throws Exception {
        Triangle t = new Triangle(1,2,1);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isIsocolesC() throws Exception {
        Triangle t = new Triangle(2,1,1);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isScaleneA() throws Exception {
        Triangle t = new Triangle(1,2,3);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isScaleneB() throws Exception {
        Triangle t = new Triangle(1,3,2);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isScaleneC() throws Exception {
        Triangle t = new Triangle(2,1,3);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isScaleneD() throws Exception {
        Triangle t = new Triangle(2,3,1);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isScaleneE() throws Exception {
        Triangle t = new Triangle(3,1,2);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isScaleneF() throws Exception {
        Triangle t = new Triangle(3,2,1);

        assert(t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(t.isScalene());
    }

    @Test
    public void isInvalidA() throws Exception {
        Triangle t = new Triangle(0,0,0);

        assert(!t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isInvalidB() throws Exception {
        Triangle t = new Triangle(-1,-1,-1);

        assert(!t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isInvalidC() throws Exception {
        Triangle t = new Triangle(1,1,-1);

        assert(!t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(!t.isScalene());
    }

    @Test
    public void isInvalidD() throws Exception {
        Triangle t = new Triangle(1,-1,1);

        assert(!t.isValid());
        assert(!t.isEquilateral());
        assert(!t.isIsocoles());
        assert(!t.isScalene());
    }
}
