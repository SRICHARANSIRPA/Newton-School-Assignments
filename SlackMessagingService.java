package OOPS.Abstraction;

public class SlackMessagingService extends MessagingService{

    public  SlackMessagingService(String Body)
    {
        super(Body,"SLACK_SECRET");
    }

    @Override
    public void Send() {
        //slack Internal API's
        super.SendMessageWithSecret();
    }
}
