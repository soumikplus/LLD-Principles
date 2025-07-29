package OpenClosedPrinciple.Example1.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification(){
        System.out.println("sending sms");
    }
    public void sendEmailNotification(){
        System.out.println("sending email");
    }
    public void sendWhatsappNotification(){
        System.out.println("sending Whatsapp");
    }
}
