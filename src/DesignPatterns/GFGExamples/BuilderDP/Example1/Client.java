package DesignPatterns.GFGExamples.BuilderDP.Example1;

public class Client {
    public static void main(String[] args) {
        ThinkpadLaptopBuilder thinkpadBuilder = new ThinkpadLaptopBuilder();
        LaptopDirector director = new LaptopDirector();
        director.construct(thinkpadBuilder);

        Laptop thinkpadLaptop = thinkpadBuilder.getResult();
        thinkpadLaptop.displayInfo();
    }
}
