package com.example.commonProxy;

public class ClassServiceImpl implements ClassService {
    public String study(String content) {
        System.out.println("今天的学习内容是：" + content);
        return content;
    }
}
