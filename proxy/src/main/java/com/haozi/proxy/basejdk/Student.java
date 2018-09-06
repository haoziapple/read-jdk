package com.haozi.proxy.basejdk;

public class Student implements Person {
    @Override
    public void sayHello() {
        System.out.println("I am a student!");
    }
}
