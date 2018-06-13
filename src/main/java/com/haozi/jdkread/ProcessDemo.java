package com.haozi.jdkread;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * @author wanghao
 * @Description
 * @date 2018-06-13 16:18
 */
public class ProcessDemo {
    public static void main(String[] args) {
        System.out.println("sss");
        File file =new File("E:\\");
        String startStr = "cmd /k dir";
        try {
            start(file , startStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(File file, String startStr) throws Exception {
        Process process = Runtime.getRuntime().exec(startStr, null, file);
        process.getOutputStream().close();
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "gbk"));
        String msg = null;
        while ((msg = br.readLine()) != null) {
            System.out.println(msg);
        }

    }
}
