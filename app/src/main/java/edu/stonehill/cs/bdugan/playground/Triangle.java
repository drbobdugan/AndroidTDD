package edu.stonehill.cs.bdugan.playground;

/**
 * Created by bdugan on 1/26/17.
 */

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public boolean isValid()
    {
        return false;
    }

    public boolean isEquilateral()
    {
        return false;
    }

    public boolean isIsocoles()
    {
        return false;
    }

    public boolean isScalene()
    {
        return false;
    }

    public Triangle(int sideA, int sideB, int sideC)
    {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public Triangle() {
        sideA = sideB = sideC = 0;
    }
}
