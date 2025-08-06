package LiskovSubstitutionPrinciple.BetterCode;

import LiskovSubstitutionPrinciple.ProblematicCode.CreditCard;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards){
            card.internationalPayment();
        }
    }
}
