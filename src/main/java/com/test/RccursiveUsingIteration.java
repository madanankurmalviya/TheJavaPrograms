package com.test;

public class RccursiveUsingIteration {

    private static int recursiveIteration(int num) {
        int fact = num;
        if (num == 0) {
            return 1;
        }
        for (int i = 2; i < num; i++) {

            System.out.println(" The num after for each - loop : " + num + " i : " + i + " fact : " + fact);
            fact = fact * i;
        }
        System.out.println(" The num after for loop ------: " + num);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("recursiveIteration(5) : " + recursiveIteration(5));
    }
}
