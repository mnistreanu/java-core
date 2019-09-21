package com.maxn.patterns.delegate;

import com.maxn.patterns.delegate.interfaces.Cook;

public class SushiCook  implements Cook {

    @Override
    public void cook() {
        System.out.println("Cook - sushi");
    }
}
