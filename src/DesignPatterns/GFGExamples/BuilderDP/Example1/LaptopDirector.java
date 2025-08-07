package DesignPatterns.GFGExamples.BuilderDP.Example1;

public class LaptopDirector {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }

}
