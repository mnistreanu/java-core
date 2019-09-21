package com.maxn.patterns.abstractFactory;

import com.maxn.patterns.abstractFactory.dell.DellDeviceFactory;
import com.maxn.patterns.abstractFactory.interfaces.DeviceFactory;
import com.maxn.patterns.abstractFactory.interfaces.Keyboard;
import com.maxn.patterns.abstractFactory.interfaces.Mouse;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DellDeviceFactory();
//        DeviceFactory deviceFactory = new LenovoDeviceFactory();

        Keyboard keyboard = deviceFactory.getKeyboard();
        Mouse mouse = deviceFactory.getMouse();

        keyboard.type();
        mouse.click();
    }

}
