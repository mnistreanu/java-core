package com.maxn.patterns.abstractFactory.lenovo;


import com.maxn.patterns.abstractFactory.interfaces.Keyboard;

public class LenovoKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Lenovo keyboard - type");
    }
}
