package com.epam.task1.goal6;

public class Exercise6 {
    /**
     * Return sum of maximum number and minimum number.
     *
     * @param num1 first value
     * @param num2 second value
     * @param num3 third value
     * @return sum of maximum number and minimum number.
     * @throws Exception if some of value is incorrect.
     */
    public double sumOfMaxMinNum(double num1, double num2, double num3) throws Exception {
        double[] arr = new double[]{num1, num2, num3};
        for (double i : arr) {
            checkINput(i);
        }
        double max = num1;
        double min = num1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            } else {
                min = arr[i + 1];
            }
        }
        if ((max + min) == Double.MAX_VALUE) {
            System.out.println("very large values, possible loss of precision");
        }
        return max + min;
    }

    /**
     * Check that value is not infinity or NaN.
     *
     * @param num value
     * @throws Exception if value is incorrect
     */
    public void checkINput(double num) throws Exception {
        if (Double.isNaN(num) || Double.isInfinite(num)) {
            throw new Exception("invalid input");
        }
    }

}
