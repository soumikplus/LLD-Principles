package LiskovSubstitutionPrinciple.ProblematicCode;

public class VisaCard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation for Visa card");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer implementation for Visa card");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation of Visa card");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payment implementation for Visacard");
    }

    @Override
    public void upiPayments() {
        // throw new NoSuchMethodException();
    }

    @Override
    public void internationalPayment() {
        System.out.println("International payment implementation of Visa");
    }
}
