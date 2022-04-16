package com.example.demo.GenericMethod.confusedUse;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test01 {

    @Test
    public void test_01(){

        Demo01<String,Integer> demo01 =  new Demo01<>();

        List<String> list1 = Arrays.asList("a","b","c","d","e");
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);

        List<Boolean> list3 = Arrays.asList(true,false,false,true);
        List<Double> list4 = Arrays.asList(5.22,2.33,5.66);


        //和类泛型一致
        String test01 = demo01.test_01(list1, list2);
        demo01.test_02(list1);

        //和类泛型不一致
/*        String test11 = demo01.test_01(list3, list4);
        demo01.test_02(list3);*/
        Boolean aBoolean = demo01.test_03(list3, list4);

    }
}
