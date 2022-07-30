package OOPS.Abstraction;

public class WhatsappMessagingService extends MessagingService{


    public WhatsappMessagingService(String Body) {
        super(Body, "Whatsapp_Sercet");
    }

    @Override
    public void Send() {
        //External Whatsapp API's
        super.SendMessageWithSecret();
    }
}
