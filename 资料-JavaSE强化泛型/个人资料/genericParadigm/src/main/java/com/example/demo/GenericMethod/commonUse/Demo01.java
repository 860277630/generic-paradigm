package com.example.demo.GenericMethod.commonUse;


import java.util.*;

public class Demo01 {
    private static Random random = new Random();

    //非静态  单一泛型 有返回值
    public <T> T trans_01(List<T> list){
        return list.get(random.nextInt(4));
    }

    //非静态  单一泛型 无返回值
    public <T> void trans_02(List<T> list){
        list.forEach(x->{
            System.out.println(x);
        });
    }

    //非静态 多泛型 有返回值
    public <T,E> T trans_03(List<T> tList,List<E> eList){
        tList.addAll((Collection<? extends T>) eList);
        return tList.get(random.nextInt(6));
    }

    //非静态 多泛型 无返回值
    public <T,E> void trans_04(List<T> tList,List<E> eList){
        tList.forEach(t-> System.out.println(t));
        eList.forEach(e-> System.out.println(e));
    }

    //可变参数
    public <T> List<T> trans_05(T... param){
        return Arrays.asList(param);
    }

}

class Demo02{

    private static Random random = new Random();

    //静态 单泛型  无返回值
    public static <E> void trans_06(List<E> eList){
        eList.forEach(e->{
            System.out.println(e);
        });
    }
    //静态 多泛型 有返回值
    public static <T,E> T trans_07(List<T> tList,List<E> eList){
        tList.addAll((Collection<? extends T>) eList);
        return tList.get(random.nextInt(6));
    }

}

class Demo03{
    public static void main(String[] args) {
        //数据准备
        Demo01 demo01 = new Demo01();
        List<String> list1 = Arrays.asList("a","b","c","d","e");
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
        String[] strs = {"a","b","c","d","e"};

        String trans01 = demo01.trans_01(list1);
        demo01.trans_02(list1);
        String trans03 = demo01.trans_03(list1, list2);
        demo01.trans_04(list1,list2);
        demo01.trans_05(strs);
        Demo02.trans_06(list1);
        Demo02.trans_07(list1,list2);
    }
}
