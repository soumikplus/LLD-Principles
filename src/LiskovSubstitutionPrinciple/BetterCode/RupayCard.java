package LiskovSubstitutionPrinciple.BetterCode;

public class RupayCard extends CreditCard implements UpiCompatibleCreditCard{

    @Override
    public void tapAndPay() {
        // implementation
        System.out.println("Tap and Pay implementation for RuPay card");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer implementation for RuPay card");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe and Pay implementation for RuPay card");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payment implementation for RuPay card");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI payment implementation for RuPay card");
    }

}
