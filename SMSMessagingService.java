package OOPS.Abstraction;

public class SMSMessagingService extends MessagingService{

    public  SMSMessagingService(String Body)
    {
        super(Body,"SMS_SECRET");
    }


    @Override
    public void Send() {
        //External SMS API's
        super.SendMessageWithSecret();
    }
}
