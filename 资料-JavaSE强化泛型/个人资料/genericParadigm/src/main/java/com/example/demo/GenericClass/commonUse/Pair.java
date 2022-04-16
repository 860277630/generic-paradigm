package com.example.demo.GenericClass.commonUse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair<T> {

    private String orderName;
    private int orderId;
    private T first;
    private T last;

}

