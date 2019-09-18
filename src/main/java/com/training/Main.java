package com.training;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.fibonacciCyclic(30));
        System.out.println(MyMath.fibonacciRecursive(30));
        System.out.println(MyMath.factorialCyclic(6));
        System.out.println(MyMath.factorialRecursive(6));
        System.out.println(MyMath.factorialBig(100));


        int[] a = {1,3,5,4,8,0,7,6,2,9};
        System.out.println(Arrays.toString(MySort.bubbleSort(a)));
        int[] b = {20,30,50,10,100,70,80,60,40,90};
        System.out.println(Arrays.toString(MySort.insertionSort(b)));
        int[] c = {400,100,900,700,300,600,500,200,800,1000};
        System.out.println(Arrays.toString(MySort.selectionSort(c)));


    }
}
