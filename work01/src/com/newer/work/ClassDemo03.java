package com.newer.work;

public class ClassDemo03 {
    public static void main(String[] args) {
/*
        输出系统类加载器及其父加载器
        输出加载Object类的加载器
        输出加载当前类的加载器
*/
        Class c = System.class;
        System.out.println(c.getClassLoader());
        if(c.getClassLoader()!=null)
        System.out.println(c.getClassLoader().getParent());

        Class c1 = Object.class;
        System.out.println(c.getClassLoader());
        if(c1.getClassLoader()!=null)
            System.out.println(c1.getClassLoader().getParent());
        Class c2 = ClassDemo03.class;
        System.out.println(c2.getClassLoader());
        if(c2.getClassLoader()!=null)
        System.out.println(c2.getClassLoader().getParent());
    }
}
