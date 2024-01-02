package com.test;

public class RevAtOddPlaced {

    private static String getRev(String str){
        char[] ch = str.toCharArray();
        String revString = "";
        for(int i = ch.length-1; i >=0; i --){
           revString = revString + ch[i];
        }
        return revString;
    }

    private static void getRevAtOddPlace(String str){
        String[] ch = str.split(" ");
        String initvalue = "";
        String value = "";
        for (int i=0; i < ch.length ; i ++){

            if(i%2 !=0){
                value = ch[i];
                System.out.println("at if loop : "+value+" i= "+i+"--i%2 = "+i%2);
            }else{
                value = getRev(ch[i]);
                System.out.println("at ELSE loop : "+value+" i= "+i);
            }
                initvalue = initvalue +" "+value;
        }
        System.out.println("The new Sentence is : "+initvalue);
    }
    public static void main(String[] args) {
        getRevAtOddPlace("Hello my name is Ankur Malviya. Here is my test script to find reverse at the odd place.");
    }
}
