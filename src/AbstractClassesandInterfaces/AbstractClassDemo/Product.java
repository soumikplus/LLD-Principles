package AbstractClassesandInterfaces.AbstractClassDemo;

public abstract class Product {
    // abstract method
    public abstract double calculateDiscount();
    // concrete method
    public void termsAndCondition(){
        System.out.println("T&C");
    }

}
