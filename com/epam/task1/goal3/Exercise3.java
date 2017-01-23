package com.epam.task1.goal3;

public class Exercise3 {
    private double a;
    private double b;

    /**
     * Create triangle with two sides.
     *
     * @param a first cathetus
     * @param b second cathetus
     * @throws Exception if 'a' or 'b' are zero or less, and if 'a' or 'b' are infinity or NaN.
     */
    public Exercise3(double a, double b) throws Exception {
        this.a = a;
        this.b = b;
        if (a <= 0 || b <= 0) {
            throw new Exception("'a' and 'b' are the sides of triangle and they can not be zero or less");
        } else if (Double.isNaN(a) || Double.isNaN(b) || Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new Exception("invalid input");
        }
    }

    /**
     * Calculate area of triangle by two cathetus.
     *
     * @return double value of triangle's area.
     */
    public double clcArea() {
        return (a * b) / 2;
    }

    /**
     * Calculate the perimeter of the Pythagorean theorem.
     *
     * @return double value of triangle's area.
     */

    public double clcPerimetr() {
        //Math.sqrt((a * a) + (b * b)) calculate third side of triangle.
        return a + b + Math.sqrt((a * a) + (b * b));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
