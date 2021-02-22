package com.newer.work;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        /*定义List接口的类对象，并显示其相关信息
        将List接口的引用指向ArrayList实例时，显示其类对象的相关信息*/
        List list = new ArrayList();

        Class c = List.class;
        Class c1 = list.getClass();

        System.out.println("包名:"+c.getPackage().getName());
        System.out.println("是否为接口"+c.isInterface());
        System.out.println("是否为基本数据量类型:"+c.isPrimitive());
        System.out.println("是否为数组"+c.isArray());
        System.out.println("获取父类的class对象"+c.getSuperclass());
        System.out.println("-====================");
        System.out.println("包名:"+c1.getPackage().getName());
        System.out.println("是否为接口"+c1.isInterface());
        System.out.println("是否为基本数据量类型:"+c1.isPrimitive());
        System.out.println("是否为数组"+c1.isArray());
        System.out.println("获取父类的class对象"+c1.getSuperclass());




    }
}
