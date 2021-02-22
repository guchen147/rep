package com.newer.work;

import java.util.Scanner;

public class ClassDemo02 {
    public static void main(String[] args) throws Exception {
        // 检索任意类的继承关系，并输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类名:");
        String ClassName = sc.next();
        Class c = Class.forName(ClassName);
        System.out.println(c);
        while (c != null) {
            c = c.getSuperclass();
            if(c!=null)
            System.out.println(c);
        }
    }
}
