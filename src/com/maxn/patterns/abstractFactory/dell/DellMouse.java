package com.maxn.patterns.abstractFactory.dell;


import com.maxn.patterns.abstractFactory.interfaces.Mouse;

public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Dell mouse - click");
    }
}
