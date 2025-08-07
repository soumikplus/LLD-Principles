package DesignPatterns.GFGExamples.BuilderDP.Example1;

public class ThinkpadLaptopBuilder implements Builder{
    private Laptop laptop;

    public ThinkpadLaptopBuilder(){
        this.laptop = new Laptop();
    }

    @Override
    public void buildCPU() {
        laptop.setCPU("Ryzen 7735hs");
    }

    @Override
    public void buildRAM() {
        laptop.setRAM("16GB");
    }

    @Override
    public void buildStorage() {
        laptop.setStorage("512GB SSD");
    }

    @Override
    public Laptop getResult() {
        return laptop;
    }
}
