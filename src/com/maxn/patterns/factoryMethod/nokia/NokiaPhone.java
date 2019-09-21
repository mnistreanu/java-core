package com.maxn.patterns.factoryMethod.nokia;

import com.maxn.patterns.factoryMethod.interfaces.Phone;

public class NokiaPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Nokia phone - call");
    }
}
