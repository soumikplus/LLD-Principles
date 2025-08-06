package LiskovSubstitutionPrinciple.ProblematicCode;

public abstract class CreditCard {
    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setCcNumber(String ccNumber){
            this.ccNumber = ccNumber;
    }
    public void setCvv(int cvv){
            this.cvv = cvv;
    }
    public void setOwnerName(String ownerName){
            this.ownerName = ownerName;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();

    public abstract void upiPayments();

    public abstract void internationalPayment();

    public void displayCreditCardDetails(){
        System.out.println("CC Number : "+this.ccNumber + ", with ownerName : "+this.ownerName);
    }
}
