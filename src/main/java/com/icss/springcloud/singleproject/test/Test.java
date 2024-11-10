package com.icss.springcloud.singleproject.test;


public class Test {

    public int age;
    public static int height=170;
    public Test(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        Test test=new Test(12);
        Test.height=180;
        System.out.println(test.height);
    }
}

