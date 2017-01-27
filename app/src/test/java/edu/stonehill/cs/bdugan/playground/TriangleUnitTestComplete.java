package edu.stonehill.cs.bdugan.playground;

import org.junit.Test;

/**
 * Created by bdugan on 1/26/17.
 */

public class TriangleUnitTestComplete {
    @Test
    public void construction_isCorrect() throws Exception {
        Triangle t = new Triangle(1,1,1);

        assert(t.isValid());
    }
}
