package com.test;

public class FibonnaciSeries {
    private static void getFibonaci(int initNum, int length1) {
        int a = initNum;
        int b=a;
        for (int i = 0 ; i < length1; i++) {
            b = a + b;
            a= b;

            System.out.println(initNum+", "+a+", "+b+", ");
        }

        System.out.println("the "+initNum+", "+a+", "+b+", ");
        }

    public static void main(String[] args) {
        getFibonaci(1,10);
    }

    }
