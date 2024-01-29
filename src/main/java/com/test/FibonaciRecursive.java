package com.test;

public class FibonaciRecursive {

    private static int fiboncaiRecursive(int num) {
        if (num < 2) {
            return num;
        }
        return fiboncaiRecursive(num - 1) + fiboncaiRecursive(num - 2);
    }

    public static void main(String[] args) {
       System.out.print("The fiboncaiRecursive : "+fiboncaiRecursive(8
       ));
    }
}
