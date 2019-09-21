package com.maxn.patterns.abstractFactory.dell;


import com.maxn.patterns.abstractFactory.interfaces.Keyboard;

public class DellKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Dell keyboard - type");
    }
}
