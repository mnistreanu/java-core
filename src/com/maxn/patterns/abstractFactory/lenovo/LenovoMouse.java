package com.maxn.patterns.abstractFactory.lenovo;


import com.maxn.patterns.abstractFactory.interfaces.Mouse;

public class LenovoMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Lenovo mouse - click");
    }
}
