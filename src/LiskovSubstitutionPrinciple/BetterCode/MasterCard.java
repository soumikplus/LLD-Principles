package LiskovSubstitutionPrinciple.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer implementation of MasterCard");

    }

    @Override
    public void swipeAndPay() {
        System.out.println("swap and pay implementation of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate implementation of MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("International payment implementation of MasterCard");
    }
}
