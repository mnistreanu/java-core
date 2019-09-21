package com.maxn.patterns.fasade;

public class FasadeMain {

    public static void main(String[] args) {
        TableFasade tableFasade = new TableFasade();
        tableFasade.setup();
    }

}
