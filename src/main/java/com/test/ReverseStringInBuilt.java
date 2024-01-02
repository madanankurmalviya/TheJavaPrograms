package com.test;

public class ReverseStringInBuilt {

    private static void getReverse(String str){
        StringBuffer sb = new StringBuffer(str);
        StringBuffer revString = sb.reverse();
        System.out.println("The reverse String is : "+revString);
    }
    public static void main(String[] args) {
        getReverse("AnkurMalviya");
    }
}
