package DependencyInversionPrinciple.Example1.ProblematicCode;

public class Car {
    private PetrolEngine engine;    //depends on concrete class
    public Car(){
        this.engine = new PetrolEngine();   // tightly coupled
    }
    public void startCar(){
        engine.start();
    }
}
