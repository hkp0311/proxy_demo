package com.example.commonProxy;

public class ClassProxy implements ClassService {
    private final ClassService classService;

    public ClassProxy(ClassService classService) {
        this.classService = classService;
    }

    public String study(String content) {
        System.out.println("课前预习中");
        classService.study(content);
        System.out.println("课后复习中");
        return null;
    }
}
