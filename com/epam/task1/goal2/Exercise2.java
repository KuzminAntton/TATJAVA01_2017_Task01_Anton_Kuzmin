package com.epam.task1.goal2;


public class Exercise2 {
    /**
     * Calculate value of the formula.
     *
     * @param a one of the double parameters of formula.
     * @param b one of the double parameters of formula
     * @param c one of the double parameters of formula
     * @return result of the calculation
     */
    public double clcByForm(double a, double b, double c) throws Exception {
        double sqrtAns = (b * b) + (4 * a * c);
        if (a == 0 && b == 0) {
            throw new ArithmeticException(" variable 'a' and 'b' can not be zero since it will lead to a division by zero is not permissible");
        }
        double res = 0;
        if (sqrtAns == 0) {
            res = ((Math.pow(a, 3) * c) + Math.pow(b, -2));
        } else if (sqrtAns > 0) {
            res = ((b + Math.sqrt(sqrtAns) / 2 * a) - ((Math.pow(a, 3) * c) + Math.pow(b, -2)));
        } else if (sqrtAns < 0) {
            throw new Exception("radicand can not be negative");
        }

        return res;
    }
}
