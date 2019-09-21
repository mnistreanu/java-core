package com.maxn.patterns.abstractFactory.lenovo;

import com.maxn.patterns.abstractFactory.interfaces.DeviceFactory;
import com.maxn.patterns.abstractFactory.interfaces.Keyboard;
import com.maxn.patterns.abstractFactory.interfaces.Mouse;

public class LenovoDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new LenovoKeyboard();
    }
}
