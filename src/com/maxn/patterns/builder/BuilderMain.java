package com.maxn.patterns.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Computer c1 = new ComputerBuilder()
                .setCpu("AMD")
                .setRam(16)
                .setSsd(512)
                .build();

        Computer c2 = new ComputerBuilder()
                .setRam(32)
                .setSsd(512)
                .build();

        System.out.println(c1);
        System.out.println(c2);

    }

}
