package com.epam.task1.goal7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise7 {
    /**
     * Calculate values by form and put it in table(hashmap)
     *
     * @param a start of range
     * @param b end of range
     * @param h step
     * @return table of arguments and values
     * @throws Exception if values is infinity or NaN
     */
    public HashMap<Double, Double> listOfValuesByForm(double a, double b, double h) throws Exception {
        checkINput(a);
        checkINput(b);
        checkINput(h);
        HashMap<Double, Double> table = new HashMap<>();
        double resOfFunc = 0;
        while (true) {
            if (a >= b) {
                break;
            }
            resOfFunc = Math.sin(a) * Math.sin(a) - Math.cos(2 * a);
            table.put(a, resOfFunc);
            a += h;
        }
        return table;
    }

    /**
     * print table
     *
     * @param table table with results
     */
    public void printTable(HashMap<Double, Double> table) {
        System.out.println("Arguments " + "Values");
        Map<Double, Double> treeMap = new TreeMap<>(table);
        for (Map.Entry e : treeMap.entrySet()) {

            System.out.println(e.getKey() + "       " + e.getValue());
        }
    }

    /**
     * Check that value is not infinity or NaN.
     *
     * @param num value
     * @throws Exception if value is incorrect, NaN or Infinity.
     */
    public void checkINput(double num) throws Exception {
        if (Double.isNaN(num) || Double.isInfinite(num)) {
            throw new Exception("invalid input");
        }
    }
}
