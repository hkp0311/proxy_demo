package com.example.jdkProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ClassService obj = new ClassServiceImpl();
        ClassService classService = (ClassService) JdkProxyFactory.getProxy(obj);
        classService.study("三国");
        //ClassService proxy = (ClassService)Proxy.newProxyInstance(obj.getClass().getClassLoader(),
        //        obj.getClass().getInterfaces(),new ClassInvocationHandler(obj));
        //proxy.study("三国");
    }
}
