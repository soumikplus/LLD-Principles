package DependencyInversionPrinciple.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        Engine petrol = new PetrolEngine();
        Engine electric = new ElectricEngine();

        Car petrolCar = new Car(petrol);
        Car electricCar = new Car(electric);

        petrolCar.startCar();
        electricCar.startCar();;
    }
}
