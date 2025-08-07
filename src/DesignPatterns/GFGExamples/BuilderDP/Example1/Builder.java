package DesignPatterns.GFGExamples.BuilderDP.Example1;

public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Laptop getResult();
}
