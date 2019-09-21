package com.maxn.patterns.factoryMethod.samsung;

import com.maxn.patterns.factoryMethod.interfaces.Phone;

public class SamsungPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Samsung phone - call");
    }
}
