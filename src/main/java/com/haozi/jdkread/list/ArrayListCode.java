package com.haozi.jdkread.list;

import java.util.ArrayList;
import java.util.List;

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

        // 测试计算斐波那契数列的方法
        System.out.println(count(6));

        // 测试在方法里改变对象的引用(java中只有值传递！！！)
        changeRef(arrayList);
        System.out.println(arrayList);
    }

    public static void push1(int[] ints) {
        ints[0] = ints[1];
        ints[1] = ints[2];
        ints[2] = ints[0] + ints[1];
    }

    public static int count(int i) {
        int[] ints = {1, 1, 2};
        for (int x = 1; x < i; x++) {
            push1(ints);
        }
        return ints[0];
    }

    public static void changeRef(List list){
        list = new ArrayList();
    }
}
