package com.haozi.jdkread.list;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VectorCodeTest extends TestCase {

    public void testArrayClass() {
        System.out.println("======testArrayClass======");
        String[] subArray = {new String(), new String()};
        //class java.lang.String
        System.out.println(new String().getClass());

        //class [Ljava.lang.String;
        System.out.println(subArray.getClass());

        Object[] baseArray = subArray;
        //关键是这里，虽然声明了Object[]
        //但实际数组类型仍然是class [Ljava.lang.String;
        System.out.println(baseArray.getClass());

        // java.lang.ArrayStoreException
        baseArray[0] = new Object();
    }

    public void testArrayClass2() {
        System.out.println("======testArrayClass2======");
        List<String> dataList = new ArrayList<String>();
        dataList.add("one");
        dataList.add("two");

        Object[] listToArray = dataList.toArray();

        // class [Ljava.lang.Object;返回的是Object数组
        System.out.println(listToArray.getClass());
        listToArray[0] = "";
        listToArray[0] = 123;
        listToArray[0] = new Object();
    }

    public void testArrayCopy() {
        System.out.println("=======testArrayCopy=======");
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = Arrays.copyOf(arr1, 4);
        //[a, b, c, null]
        //多余位置会以null补齐
        System.out.println(Arrays.toString(arr2));

    }

}