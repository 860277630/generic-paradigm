package com.example.demo.GenericClass.commonUse;

import org.junit.Test;

//自定义泛型类的使用
public class Test01 {
    @Test
    public void test_1(){
        //泛型类在创建对象的时候，来指定操作的具体数据类型。
        //泛型类在创建对象的时候，没有指定类型，将按照Object类型来操作。
        //泛型类，不支持基本数据类型。
        Pair<String> pair1 = new Pair<>("default",0,"firstStr","secondStr");
        Pair<Integer> pair2 = new Pair<>("default",0,1,2);
        //Pair<int> pair3 = new Pair<>("default",0,1,2);
        Pair pair4 = new Pair<>("default",0,1,"string");

        //同一泛型类，根据不同的数据类型创建的对象，本质上是同一类型。
        System.out.println(pair1.getClass());
        System.out.println(pair2.getClass());
        System.out.println(pair4.getClass());
        System.out.println(pair1.getClass() == pair2.getClass());
        System.out.println(pair2.getClass() == pair4.getClass());

    }
}
