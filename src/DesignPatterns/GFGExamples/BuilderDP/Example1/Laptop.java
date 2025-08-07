package DesignPatterns.GFGExamples.BuilderDP.Example1;

public class Laptop {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }
    public void setStorage(String storage){
        this.storage = storage;
    }
    public void displayInfo(){
        System.out.println("Configurations : ");
        System.out.println("CPU :" + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
    }
}
