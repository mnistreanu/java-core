package com.maxn.patterns.builder;

public class ComputerBuilder {

    private String cpu = "Intel";
    private int ram = 4;
    private int ssd = 250;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setRam(ram);
        computer.setSsd(ssd);

        return computer;
    }

}
