package com.newer.work;

public class Test1{
    public static void main(String[] args) {
        System.out.println(Test1.class.getClassLoader());
        Test2 t2 = new Test2();
        t2.print();
    }

}
