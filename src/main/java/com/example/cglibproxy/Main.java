package com.example.cglibproxy;

public class Main {
    public static void main(String[] args) {
        ClassService classService = (ClassService) CglibProxyFactory.getProxy(ClassService.class);
        classService.study("三国");
    }
}
