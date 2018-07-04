package com.haozi.jdkread.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        System.out.println(vector.toString());

        // 使用elements遍历
        Enumeration enumeration = vector.elements();
        //因为使用了内部类
        //class java.util.Vector$1
        System.out.println(enumeration.getClass());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
