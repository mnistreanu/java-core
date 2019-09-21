package com.maxn.patterns.factoryMethod;

import com.maxn.patterns.factoryMethod.interfaces.Phone;
import com.maxn.patterns.factoryMethod.interfaces.PhoneMaker;
import com.maxn.patterns.factoryMethod.nokia.NokiaPhoneMaker;
import com.maxn.patterns.factoryMethod.samsung.SamsungPhoneMaker;

public class FactoryMethodMain {

    public static void main(String[] args) {

        PhoneMaker phoneMaker = getPhoneMaker(PhoneMakerType.SAMSUNG);
//        PhoneMaker phoneMaker = getPhoneMaker(PhoneMakerType.NOKIA);

        Phone phone = phoneMaker.makePhone();
        phone.call();
    }

    private static PhoneMaker getPhoneMaker(PhoneMakerType makerType) {
        switch (makerType) {
            case NOKIA:
                return new NokiaPhoneMaker();

            case SAMSUNG:
                return new SamsungPhoneMaker();

            default:
                throw new IllegalStateException("Unexpected value: " + makerType);
        }
    }

    enum PhoneMakerType {
        SAMSUNG,
        NOKIA
    }

}
