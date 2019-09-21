package com.maxn.patterns.delegate;

public class DelegateMain {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        // pizza
        waiter.setCook(new PizzaCook());
        waiter.acceptOrder();

        // sushi
        waiter.setCook(new SushiCook());
        waiter.acceptOrder();
    }

}
