package DependencyInversionPrinciple.Example1.BetterCode;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine Starting");
    }
}
