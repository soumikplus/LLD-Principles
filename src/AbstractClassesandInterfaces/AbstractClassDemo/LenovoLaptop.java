package AbstractClassesandInterfaces.AbstractClassDemo;

public class LenovoLaptop extends Product{

    @Override
    public double calculateDiscount(){
        return 0;
    }
    @Override
    public void termsAndCondition(){
        System.out.println("Terms of Lenovo Laptop");
    }

}
