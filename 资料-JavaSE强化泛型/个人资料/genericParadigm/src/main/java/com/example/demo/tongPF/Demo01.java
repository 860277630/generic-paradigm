package com.example.demo.tongPF;

import com.example.demo.tongPF.entities.Father;
import com.example.demo.tongPF.entities.Grandfather;
import com.example.demo.tongPF.entities.Son;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//测试通配符
public class Demo01 {

    public static Random random = new Random();

    //用泛型方式实现
    private <T> String method_01(List<T> list) {
        //泛型方式是无法统计年龄的总数的
        StringBuilder str = new StringBuilder();
        list.forEach(x -> {
            str.append(x.toString());
        });
        return str.toString();
    }

    //用上限式通配符实现
    private String method_02(List<? extends Father> list) {
        Integer result = 0;
        for (Father father : list) {
            result = +father.getAge();
        }
        return String.valueOf(result);
    }

    //用下限式通配符实现
    private String method_03(List<? super Father> list) {
        StringBuilder str = new StringBuilder();
        list.forEach(x -> {
            str.append(x.toString());
        });
        return str.toString();
    }

    @Test
    public void test_01()throws Exception{
        List<Grandfather> list1 = (List<Grandfather>) getList(Grandfather.class);
        List<Father> list2 = (List<Father>) getList(Father.class);
        List<Son> list3 = (List<Son>) getList(Son.class);

        System.out.println(method_01(list1));

        //System.out.println(method_02(list1));
        System.out.println(method_02(list2));
        System.out.println(method_02(list3));

        System.out.println(method_03(list1));
        System.out.println(method_03(list2));
       // System.out.println(method_03(list3));


    }

    private List<? extends Grandfather> getList(Class<? extends Grandfather> clazz) throws Exception{
        List<Grandfather> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Grandfather instance = clazz.newInstance();
            instance.setAge(random.nextInt(100));
            instance.setName(RandomStringUtils.randomAlphanumeric(5));
            list.add(instance);
        }
        return list;
    }

}
