package com.maxn.patterns.factoryMethod.samsung;

import com.maxn.patterns.factoryMethod.interfaces.Phone;
import com.maxn.patterns.factoryMethod.interfaces.PhoneMaker;

public class SamsungPhoneMaker implements PhoneMaker {
    @Override
    public Phone makePhone() {
        return new SamsungPhone();
    }
}
