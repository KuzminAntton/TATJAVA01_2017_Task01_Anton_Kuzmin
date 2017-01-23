package com.epam.task1.goal1;


public class Exercise1 {
    /**
     * Checks if sum of the first two numbers equals to the sum of the last two numbers.
     *
     * @param num number to check.
     * @return true if the first two numbers equals to the sum of the last two numbers  and "false" otherwise.
     * @throws Exception if number isn't four-digit.
     */
    public boolean checkNumber(int num) throws Exception {
        boolean result = false;
        if (Integer.toString(Math.abs(num)).length() != 4) {
            throw new Exception("Number must be four-digit");
        } else {
            if ((num % 10) + ((num / 10) % 10) == ((num / 100) % 10) + ((num / 1000) % 10)) {
                result = true;
            }
        }

        return result;

    }
}