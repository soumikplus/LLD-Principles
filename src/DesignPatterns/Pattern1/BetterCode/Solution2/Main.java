package DesignPatterns.Pattern1.BetterCode.Solution2;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setBrand("Lenovo");
        b.setPrice(61000);

        Product p = new Product(b);
    }
}
