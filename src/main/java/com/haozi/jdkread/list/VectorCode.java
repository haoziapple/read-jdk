package com.haozi.jdkread.list;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        System.out.println(vector.toString());

        // 使用elements遍历
        System.out.println("===使用elements遍历===");
        Enumeration enumeration = vector.elements();
        //因为使用了内部类
        //class java.util.Vector$1
        System.out.println(enumeration.getClass());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // 使用Listiterator遍历
        System.out.println("===使用Listiterator遍历===");
        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        listIterator = vector.listIterator(vector.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
