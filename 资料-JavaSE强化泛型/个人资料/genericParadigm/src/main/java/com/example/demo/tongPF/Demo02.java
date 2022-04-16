package com.example.demo.tongPF;

import com.example.demo.tongPF.entities.Father;
import com.example.demo.tongPF.entities.Son;

import java.util.List;

public class Demo02 <T extends Father>{

    public <E extends Son> void  getName(List<E> list){

        for (E e : list) {

        }
    }
}
