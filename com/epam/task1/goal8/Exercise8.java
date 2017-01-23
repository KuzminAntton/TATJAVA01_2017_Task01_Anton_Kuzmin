package com.epam.task1.goal8;


public class Exercise8 {
    /**
     * Calculate sum of the numbers are multiples of k
     *
     * @param arr array with natural numbers
     * @param k   setting multiplicity
     * @return sum of the numbers are multiples of k
     * @throws Exception if array have non-natural numbers
     */
    public double sumMultiples(int[] arr, int k) throws Exception {
        int sum = 0;
        for (double i : arr) {
            if (i <= 0) {
                throw new Exception("Array have non-natural numbers");
            }
            if (i % k == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
