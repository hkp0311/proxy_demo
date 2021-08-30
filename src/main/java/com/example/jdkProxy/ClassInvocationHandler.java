package com.example.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ClassInvocationHandler implements InvocationHandler {
    private final Object target;

    public ClassInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("课前预习中");
        Object result = method.invoke(target, args);
        System.out.println("课后复习中");
        return result;
    }
}
