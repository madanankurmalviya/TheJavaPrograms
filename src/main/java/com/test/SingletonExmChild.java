package com.test;

public class SingletonExmChild {
    public static void main(String[] args) {

        SingletonExample x = SingletonExample.getInstance();
        SingletonExample y = SingletonExample.getInstance();
        SingletonExample z = SingletonExample.getInstance();

        x.str = (x.str).toLowerCase();
        System.out.println(" The new Str is : "+z.str);
        if(x==y && y==z){
            System.out.println(" All x, y & z instance pointing to  same obj location x: "+x.hashCode() + " y: "+y.hashCode()+ " and z : "+z.hashCode());
        }else{
            System.out.println(" All dont have same obj location...");
        }


    }
}
