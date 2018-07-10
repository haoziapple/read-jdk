package com.haozi.jdkread.list;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ArrayListCodeTest extends TestCase {
    public void testDivideMax() {
        System.out.println(Integer.MAX_VALUE + 1);
        int i = (Integer.MAX_VALUE + 1) / 2;
        System.out.println(i);
    }

    public void testDivideMax2() {
        int i = (Integer.MAX_VALUE + 1) >> 1;
        System.out.println(i);
    }

    // 测试ArrayList中的batchRemove循环代码
    public void testLoop() {
        int size = 10;
        int r = 0, w = 0;
        try {
            for (; r < size; r++)
                System.out.println("r=" + r + ";w=" + w);
//                if (c.contains(elementData[r]) == complement)
//                    elementData[w++] = elementData[r];
        } finally {

        }
    }

    // 测试ArrayList中的batchRemove
    public void testBatchRemove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.retainAll(list);
        list.removeAll(list);
    }

    public void testAddInt(){
        int a = 2;
        int b = a;
        a++;
        System.out.println(a);
        System.out.println(b);
    }
}