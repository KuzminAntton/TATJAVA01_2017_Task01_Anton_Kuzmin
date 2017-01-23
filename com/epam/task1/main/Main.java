package com.epam.task1.main;

import com.epam.task1.goal1.Exercise1;
import com.epam.task1.goal10.Exercise10;
import com.epam.task1.goal2.Exercise2;
import com.epam.task1.goal3.Exercise3;
import com.epam.task1.goal6.Exercise6;
import com.epam.task1.goal7.Exercise7;
import com.epam.task1.goal9.Exercise9;

public class Main {
    public static void main(String[] args) throws Exception {
//        Exercise2 ex2 = new Exercise2();
//        System.out.println(ex2.clcByForm(1,2,3));
//        Exercise1 ex1 = new Exercise1();
//        System.out.println(ex1.checkNumber(-1212));

//        Exercise3 exercise3 = new Exercise3(1,2);
//        System.out.println(exercise3.clcArea());
////        System.out.println(exercise3.clcPerimetr());
//        Exercise6 exercise6 = new Exercise6();
//        System.out.println(exercise6.sumOfMaxMinNum(1.0,12,-3));
//        System.out.println(exercise6.sumOfMaxMinNum(-5,12,-34));

//        Exercise7 exercise7 = new Exercise7();
//        exercise7.printTable(exercise7.listOfValuesByForm(1,12,1.5));

//        Exercise9 exercise9 = new Exercise9();
//        double [] arr1 = new double[]{1,2,3,4};
//        double [] arr2 = new double[]{5,6,7,8};
//
//        for(double i : exercise9.mergeArrays(arr1, arr2, 2)) {
//            System.out.print(i + " ");
//        }
        Exercise10 exercise10 = new Exercise10();
        exercise10.printMatrix(exercise10.matrix(8));
    }
}
