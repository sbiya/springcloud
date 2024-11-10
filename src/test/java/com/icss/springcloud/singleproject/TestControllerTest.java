//package com.icss.springcloud.singleProject.controller;
//
//import org.junit.jupiter.api.Assertions;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.omg.PortableServer.LIFESPAN_POLICY_ID;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//@SpringBootTest
//public class TestControllerTest {
//    @Autowired
//    @Mock
//    TestController testController;
//    @org.junit.jupiter.api.Test
//    public void test() throws Exception {
//        List  a =new ArrayList();
//        a.add(1);
//        Mockito.when(testController.client()).thenReturn(a);
//        List list=testController.client();
//        System.out.println(list);
////        Mockito.verify(random).nextInt();
////        Assertions.assertEquals(101,a);
////        Assertions.assertEquals(40,list.size());
//    }
//    @org.junit.jupiter.api.Test
//    public void test2() throws Exception {
//        List list=testController.client();
////        Assertions.assertEquals(40,list.size());
//    }
//
//
//
//    @Mock
//    private Random random;
//    @org.junit.jupiter.api.Test
//    public void test3() throws Exception {
////        Random random=new Random();
////        Random random=Mockito.mock(Random.class);
//        Mockito.when(random.nextInt()).thenReturn(100);
//        int a=random.nextInt();
//        System.out.println(a);
////        Mockito.verify(random).nextInt();
////        Assertions.assertEquals(101,a);
//    }
//
//}
