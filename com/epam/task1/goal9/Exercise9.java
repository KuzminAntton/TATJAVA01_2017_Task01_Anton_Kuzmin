package com.epam.task1.goal9;


public class Exercise9 {
    /**
     * @param arr1 first array
     * @param arr2 second array
     * @param k    cell number from which to start to insert the second array
     * @return an array that consists of two : arr1 and arr2
     * @throws Exception if some of value is incorrect like Infinity or NaN.
     */
    public double[] mergeArrays(double[] arr1, double[] arr2, int k) throws Exception {
        checkArray(arr1);
        checkArray(arr2);
        double[] bigArray = new double[arr1.length + arr2.length];
        for (int i = 0; i < bigArray.length; i++) {
            if (i == k) {
                for (int j = 0; j < arr2.length; j++, i++) {
                    bigArray[i] = arr2[j];
                }
                i--;
            } else if (i < k) {
                bigArray[i] = arr1[i];
            } else {
                bigArray[i] = arr1[k];
                k++;
            }

        }
        return bigArray;
    }

    /**
     * Check that values in array are not infinity or NaN.
     *
     * @param arr array
     * @throws Exception if value is infinity or NaN.
     */
    public void checkArray(double[] arr) throws Exception {
        for (double i : arr) {
            if (Double.isInfinite(i) || Double.isNaN(i)) {
                throw new Exception("Invalid input");
            }
        }
    }
}
