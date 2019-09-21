package com.maxn.patterns.delegate;

import com.maxn.patterns.delegate.interfaces.Cook;

public class Waiter {

    private Cook cook;

    void acceptOrder() {
        cook.cook();
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }
}
