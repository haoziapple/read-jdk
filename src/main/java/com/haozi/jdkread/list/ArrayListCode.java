package com.haozi.jdkread.list;

import java.util.ArrayList;

public class ArrayListCode {
    private int num;

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        ArrayListCode arrayListCode = new ArrayListCode();
        System.out.println(arrayListCode.getNum());


        ArrayList<String> arrayList = new ArrayList<>(3);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        System.out.println(arrayList);
        System.out.println(arrayList.toArray().getClass());
    }
}
