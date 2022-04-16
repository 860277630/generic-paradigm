package com.example.demo.GenericArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01 {

    @Test
    public void test_01(){
        ArrayList<String>[] listArr = new ArrayList[5];

        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");
        listArr[0] = strList;
        String s = listArr[0].get(0);
        System.out.println(s);
    }

    @Test
    public void test_02(){
        Fruit<String> fruit = new Fruit<>(String.class,3);
        fruit.put(0,"苹果");
        fruit.put(1,"西瓜");
        fruit.put(2,"香蕉");

        System.out.println(Arrays.toString(fruit.getArray()));
        String s1 = fruit.get(2);
        System.out.println(s1);
    }
}
