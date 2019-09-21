package com.maxn.patterns.factoryMethod.nokia;

import com.maxn.patterns.factoryMethod.interfaces.Phone;
import com.maxn.patterns.factoryMethod.interfaces.PhoneMaker;

public class NokiaPhoneMaker implements PhoneMaker {
    @Override
    public Phone makePhone() {
        return new NokiaPhone();
    }
}
