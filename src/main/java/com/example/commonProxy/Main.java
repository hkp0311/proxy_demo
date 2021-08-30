package com.example.commonProxy;

public class Main {
    public static void main(String[] args) {
        ClassService classService = new ClassServiceImpl();
        ClassProxy proxy = new ClassProxy(classService);
        proxy.study("三国");
    }
}
