package com.icss.springcloud.singleproject.test;


public class Enum {

    public static void main(String[] args) {
//        Nicao nicao=Nicao.inst;
        Mon m=new Mon();
        m.fun();
    }

}
enum Nicao{
    inst;
    private void  Nicao(){

//        System.out.println(1111111111);
    }
}

class Mon{
    static int a=0;
    static {
//        System.out.println(4444444);
        a=3;
    }
    public void fun(){
//        System.out.println(Mon.a);

    }
}
