package com.epam.task1.goal5;


public class Exercise5 {
    /**
     * Return array of raising to a power number.
     * If number is zero or less, power is four, else, power is three.
     *
     * @param num1 real number
     * @param num2 real number
     * @param num3 real number
     * @return array of raised to the power numbers.
     * @throws Exception if options is incorrect like NaN or Infinity.
     */
    public double[] raisingToAPower(double num1, double num2, double num3) throws Exception {
        if (Double.isInfinite(num1) || Double.isNaN(num1) || Double.isInfinite(num2) || Double.isNaN(num2) ||
                Double.isInfinite(num3) || Double.isNaN(num3)) {
            throw new Exception("invalid input");
        }
        double[] arr = new double[]{num1, num2, num3};
        for (double i : arr) {
            if (i < 0) {
                i = Math.pow(i, 4);
            } else {
                i = Math.pow(i, 2);
            }
        }

        return arr;
    }
}
