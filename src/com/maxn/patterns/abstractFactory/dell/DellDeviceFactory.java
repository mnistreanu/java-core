package com.maxn.patterns.abstractFactory.dell;

import com.maxn.patterns.abstractFactory.interfaces.DeviceFactory;
import com.maxn.patterns.abstractFactory.interfaces.Keyboard;
import com.maxn.patterns.abstractFactory.interfaces.Mouse;

public class DellDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DellKeyboard();
    }
}
