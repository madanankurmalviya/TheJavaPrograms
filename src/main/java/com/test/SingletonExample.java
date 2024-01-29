package com.test;

public class SingletonExample {
    private static SingletonExample singleton_instance = null;
    public String str;
    private SingletonExample(){
        str = "Hello There...";
    }

    public static synchronized SingletonExample getInstance(){
        if(singleton_instance == null){
            singleton_instance = new SingletonExample();
        }
        return singleton_instance;
    }
}
