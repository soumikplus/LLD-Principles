package AbstractClassesandInterfaces.AbstractClassDemo;

interface A{
    default void doSomething(){
        System.out.println("This is interface A");
    }
}
interface B{
    default void doSomething(){
        System.out.println("This is interface B");
    }

}
class C implements A,B{
    @Override
    public void doSomething(){
        B.super.doSomething();
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("The main func");
    }
}

