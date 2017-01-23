package com.epam.task1.goal10;


public class Exercise10 {
    /**
     *  Make a square matrix.
     *
     * @param n size of matrix.
     * @return double array.
     * @throws Exception if n isn't an even.
     */
    public int[][] matrix(int n) throws Exception {
        if(n % 2 != 0) {
            throw new Exception("n do not even");
        }
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i % 2 == 0) {
                        matrix[i][j] = j + 1;
                    } else {
                        matrix[i][j] = n-j;
                    }
                }
        }
        return matrix;
    }

    /**
     * print matrix
     *
     * @param matrix
     */
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
