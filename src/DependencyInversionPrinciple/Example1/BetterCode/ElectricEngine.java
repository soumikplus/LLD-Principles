package DependencyInversionPrinciple.Example1.BetterCode;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starting");
    }
}
