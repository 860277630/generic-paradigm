package com.example.demo.GenericMethod.confusedUse;

import java.util.Collection;
import java.util.List;

public class Demo01<T,K> {

    public <T, K> T test_03(List<T> tList, List<K> kList) {
        tList.addAll((Collection<? extends T>) kList);
        return tList.get(0);
    }

    public T test_01(List<T> tList,List<K> kList){
        tList.addAll((Collection<? extends T>) kList);
        return tList.get(0);
    }

    public void test_02(List<T> tList){
        tList.forEach(t->{
            System.out.println(t);
        });
    }
}
