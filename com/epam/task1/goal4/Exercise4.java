package com.epam.task1.goal4;

public class Exercise4 {
    /**
     * @param x first coordinate
     * @param y second coordinate
     * @return true if point fall in range and false if otherwise
     * @throws Exception check that coordinates is not a infinity or NaN
     */
    public boolean isWithinRange(double x, double y) throws Exception {
        if (Double.isInfinite(x) || Double.isNaN(x) || Double.isInfinite(y) || Double.isNaN(y)) {
            throw new Exception("invalid input");
        }
        boolean res = false;
        if (y >= -3 && y <= 4 && x >= -2 && x <= 2) {
            res = true;
        } else if (y >= -3 && y <= 0 && x >= -4 && x <= 4) {
            res = true;
        }
        return res;
    }
}
