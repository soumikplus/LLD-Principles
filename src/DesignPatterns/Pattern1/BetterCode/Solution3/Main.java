package DesignPatterns.Pattern1.BetterCode.Solution3;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder().setName("Thinkpad").setPrice(61000).setBrand("Lenovo").build();
    }
}
