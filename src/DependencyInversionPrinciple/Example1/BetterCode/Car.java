package DependencyInversionPrinciple.Example1.BetterCode;

public class Car {
    private Engine engine;  // depends on abstraction not on concrete class
    public Car(Engine engine){
        this.engine = engine;
    }
    public void startCar(){
        engine.start();
    }
}
